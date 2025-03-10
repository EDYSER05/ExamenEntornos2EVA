/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenentornostema3y4;

/**
 *
 * @author Eduar
 */
public class Main {
    public static void main(String[] args) throws Exception {
        //Creamos el pedido de Carlos
        Pedido p1 = new Pedido("Carlos");
        
        //Agregamos productos al pedido de carlos
        p1.agregarProducto("Smartphone", 500);
        p1.agregarProducto("Auriculares", 50);
        p1.agregarProducto("Cargador", 20);
        p1.agregarProducto(null,0);
        p1.agregarProducto("Televisor", -1000);
        
        System.out.println(p1.toString());
    }
}
