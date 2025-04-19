package io.github.unlp_oo.ejercicio2_Sueldos_PatronesDD;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PasanteTest {
	
	private Pasante pasante;
	
	@BeforeEach
	void setUp() throws Exception{
		pasante = new Pasante("Adrian", 20000.00, 3);//20000 + 6000
	}												 //- (2600 + 300) 2900
	@Test											 // total 20200
	public void sueldoAdicional(){
		assertEquals(6000, pasante.sueldoAdicional() );
	}
	@Test
	public void sueldo(){
		assertEquals(23100.00, pasante.sueldo());
	}
}
