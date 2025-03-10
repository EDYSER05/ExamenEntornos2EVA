/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenentornostema3y4;

/**
 *
 * @author Eduar
 */
import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author Eduardo Navarro
 * 
 */
public class Pedido {
    private String cliente;
    private List<String> productos;
    private double total;

    /**
     * 
     * @param cliente Nombre del cliente a nombre de un pedido, a partir de ahí añadiremos el resto de datos
     */
    public Pedido(String cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.total = 0;
    }

    //Nos será util en los tests para comprobar que los productos se añaden correctamente
    /**
     * 
     * @return devuelve la Lista de productos
     */
    public List<String> getProductos() {
        return productos;
    }
    
    /**
     * 
     * @param producto Nombre del producto que queremos añadir
     * @param precio Precio del producto que queremos añadir
     * @throws Exception Error en caso de tener precio menor que 0 o nombre vacio
     */
    public void agregarProducto(String producto, double precio) throws Exception {
        //Añadimos que si el producto es distinto de null agregue el producto
        if (precio > 0&&producto!=null) {
            productos.add(producto);
            total += precio;
            System.out.println("Producto Insertado Correctamente!!!");
        } else {
            //Añadimos una excepción en caso de no poder añadir el precio 
            //con el proposito de avisar al usuario de que la acción no es posible
            /*throw new Exception("Producto no Añadido");*/
            //He comentado el throw para poner el system out print para que en el main sea mas visual
            System.err.println("Error: Producto No Insertado");
        }
    }

    //Le he cambiado el nombre a este metodo ya que al fin y al cabo es un get del precio total
    /**
     * 
     * @return devuelve el precio total incluyendo el descuento de un 10% en pedidos superiores a 100 euros
     */
    public double getTotal() {
        if (total > 100) {
            return total * 0.90; // 10% de descuento si el pedido supera los 100
        }
        //He quitado un else que no era necasario ya que si no entra en el if
        //directamente devolverá este valor
        return total;
        
    }
    
    /*
    public void mostrarPedido() {
        System.out.println("Cliente: " + cliente);
        System.out.println("Productos: " + productos);
        System.out.println("Total: " + calcularTotal());
    }
    */
    //He comentado el metodo mostrar pedido porque es mucho mejor hacer un toString()
    //Además muestra cada producto por separado en un for
    /**
     * 
     * @return Devuelve una cadena String con todos los datos del Pedido
     */
    @Override
    public String toString() {
        String text= "\nPedido: " + "\nCliente: " + cliente + "\nProductos:";
        for (int i=0;i<productos.size();i++) {
            text=text + "\n\tProducto "+(i+1)+": " + productos.get(i);
        }
        text= text + "\nTotal:" + getTotal();
        return text;
    }
    
}
