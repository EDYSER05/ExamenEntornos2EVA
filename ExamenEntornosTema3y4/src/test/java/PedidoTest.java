/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.examenentornostema3y4.Pedido;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Eduar
 */
public class PedidoTest {
    
    public PedidoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void totalPedido() throws Exception {
        //Creamos un pedido de prueba y añadimos dos productos que suman 65€
        Pedido p1 = new Pedido("Prueba");
        p1.agregarProducto("1", 50);
        p1.agregarProducto("2", 15);
        
        double resultado1=p1.getTotal();
        assertEquals(65,resultado1);
    }
    
    //El precio negativo no deberia afectar al total y por lo tanto aqui deberia equivaler a 0
    @Test
    public void preciosNegativos() throws Exception {
        //Creamos un pedido de prueba y añadimos un producto con precio negativo
        Pedido p1 = new Pedido("Prueba");
        p1.agregarProducto("1", -50);
        
        double resultado1=p1.getTotal();
        assertEquals(0,resultado1);
    }
    
    //El Nombre Vacio hará que el producto no se añada y por lo tanto la cantidad no se reste
    @Test
    public void nombreVacio() throws Exception {
        //Creamos un pedido de prueba y añadimos un producto con nombre vacio
        Pedido p1 = new Pedido("Prueba");
        p1.agregarProducto(null, 50);
        
        double resultado1=p1.getTotal();
        assertEquals(0,resultado1);
    }
    
    //Test para comprobar si en la lista se almacena todo correctamente
    @Test
    public void almacenamientoLista() throws Exception {
        //Creamos un pedido de prueba y añadimos varios productos
        Pedido pedido1 = new Pedido("Prueba");
        pedido1.agregarProducto("Producto1", 50);
        pedido1.agregarProducto("Producto2", 200);
        pedido1.agregarProducto("Producto3", 10);
        pedido1.agregarProducto("Producto4", -50);
        pedido1.agregarProducto(null, 500);
        
        //Aqui esperamos que la longitud de los productos sea 3 ya que los dos ultimos productos
        //No se añaden al tener imputs incorrectos
        int resultado1=pedido1.getProductos().size();
        assertEquals(3,resultado1);
    }
}
