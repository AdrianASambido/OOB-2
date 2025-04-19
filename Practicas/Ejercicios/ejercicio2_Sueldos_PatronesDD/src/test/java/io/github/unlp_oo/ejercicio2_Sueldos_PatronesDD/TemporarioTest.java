package io.github.unlp_oo.ejercicio2_Sueldos_PatronesDD;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TemporarioTest {
	
	private Temporario temporario;
	
	
	@BeforeEach
		void setUp() throws Exception{
		temporario = new Temporario("Adrian", 2, true, 100);//20000+4000+5000+30000	
	}														//-6500 de los 20000
	@Test								 					// -450 de los 9000					
	public void valorHijos() {							//59000 - 6950 = 52050
		assertEquals(4000, temporario.valorHijos());
	}
	@Test
	public void sueldoBasico() {
		assertEquals(50000, temporario.sueldoBasico());
	}
	@Test
	public void sueldoAdicional() {
		assertEquals(9000, temporario.sueldoAdicional());
	}
	@Test
	public void descuento() {
		assertEquals(6950, temporario.descuento());
	}
	@Test
	public void sueldo() {
		assertEquals(59000, temporario.sueldoBasico()+temporario.sueldoAdicional());
	}
}
