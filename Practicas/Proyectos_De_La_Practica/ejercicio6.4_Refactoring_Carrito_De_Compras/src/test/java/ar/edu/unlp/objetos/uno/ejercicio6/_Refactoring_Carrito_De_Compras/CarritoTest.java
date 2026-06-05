package ar.edu.unlp.objetos.uno.ejercicio6._Refactoring_Carrito_De_Compras;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class CarritoTest {
	
	Carrito carrito;
	ItemCarrito item, item2, item3;
	Producto yerba, azucar, aceite;
	
	@BeforeEach
	void setUp() throws Exception {
		carrito= new Carrito();
		yerba  = new Producto("yerba", 4500);
		azucar = new Producto("azucar",3500);
		aceite = new Producto("aceite",6500);
		item   = new ItemCarrito(yerba, 3);
		item2  = new ItemCarrito(azucar, 1);
		item3  = new ItemCarrito(aceite, 2);
		carrito.agregarItemDeProductos(item);
    	carrito.agregarItemDeProductos(item2);
    	carrito.agregarItemDeProductos(item3);		
	}
	
    @Test
    public void testMontoTotalDeLaCompra() {
        assertEquals(30000, carrito.MontoTotalDeLaCompra());
    }
}
