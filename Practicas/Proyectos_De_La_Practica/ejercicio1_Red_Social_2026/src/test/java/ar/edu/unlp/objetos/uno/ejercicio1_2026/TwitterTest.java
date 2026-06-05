package ar.edu.unlp.objetos.uno.ejercicio1_2026;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TwitterTest {
	
	Usuario jose, juan, antonio;
	Twitter twitter;
	
	@BeforeEach
	void setUp() throws Exception {
		jose    = new Usuario("jose");
		juan    = new Usuario("juan");
		antonio = new Usuario("antonio");
		twitter = new Twitter();
		twitter.addUsuario("jose");
	}
	 @Test
	 public void addUsuario() {
		// twitter.addUsuario("jose");
		 assertEquals(1,twitter.getMisUsuarios().size());
		 twitter.addUsuario("juan");
		 assertEquals(2,twitter.getMisUsuarios().size());
		 assertEquals(null,twitter.addUsuario("jose"));//intento agregar un mombre existente
	 }
	@Test
	public void deleteUsuario() {
		assertEquals(1,twitter.getMisUsuarios().size());
		assertTrue(twitter.deleteUsuario(jose));
		assertFalse(twitter.deleteUsuario(antonio));
	}

}
