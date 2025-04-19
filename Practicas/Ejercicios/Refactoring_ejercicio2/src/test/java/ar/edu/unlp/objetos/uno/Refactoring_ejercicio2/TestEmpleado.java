package ar.edu.unlp.objetos.uno.Refactoring_ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestEmpleado {
	
	public Empleado pasante; 
	public Empleado planta; 
	public Empleado temporario; 
	
	
	@BeforeEach
	void setUp() throws Exception {
		pasante    = new Pasante("Adrian", "Sambido", 10000.00, 3);
		planta     = new Planta("Greta", "Glenda", 15000.00, 6);
		temporario = new Temporario ("Facundo", "Fernandez", 25000.00, 2);
	}
	@Test
	public void testSueldoBasico() {
		assertEquals( 8700.00, pasante.getSueldoBasico());    // 10000 - 1300
		assertEquals(25050.00, planta.getSueldoBasico());     // 15000 - 1950 + 12000 x hijo
		assertEquals(23750.00, temporario.getSueldoBasico()); // 25000 - 3250 +  2000
	}
}

