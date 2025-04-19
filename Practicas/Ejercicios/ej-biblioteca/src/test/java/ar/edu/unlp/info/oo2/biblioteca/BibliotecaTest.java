package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BibliotecaTest {

	private Biblioteca biblioteca;
	private Biblioteca bibliotecaVacia;
	private Socio socio;
	
	@BeforeEach
	void setUp() throws Exception{
	biblioteca = new Biblioteca();
	bibliotecaVacia = new Biblioteca();
	socio = new Socio("Arya Stark", "needle@stark.com", "5234-5");
	biblioteca.agregarSocio(socio);	
	biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com", "2345-2"));
	}
	
	@Test
	public void testAddUsuario(){
		assertEquals(0, bibliotecaVacia.getSocios().size());
		bibliotecaVacia.agregarSocio(socio);
		assertEquals(1, bibliotecaVacia.getSocios().size());
	}
	
}