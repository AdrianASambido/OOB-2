package io.github.unlp_oo.ejercicio2_Sueldos_PatronesDD;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlantaTest {

	private Planta empPlanta;
	
	@BeforeEach
	void setUp() throws Exception {
		empPlanta = new Planta("adrian", 5, true, 5); //(50.000 + 10.000 + 5.000 + 10.000)
	}												  // - 6.500 de los 50.000 y 1250 de los 25.000
	@Test											  // 75.000 - 7.750 = 67.250
	public void testSueldo() {		
		assertEquals(67250, empPlanta.sueldo());
	}
	@Test
	public void testSueldoAdicional() {
		assertEquals(25000, empPlanta.sueldoAdicional());
	}
	@Test
	public void testValorAntiguedad() {
		assertEquals(10000, empPlanta.valorAntiguedad());
	}
	@Test
	public void testValorHijos() {
		assertEquals(10000, empPlanta.valorHijos());
	}
}
