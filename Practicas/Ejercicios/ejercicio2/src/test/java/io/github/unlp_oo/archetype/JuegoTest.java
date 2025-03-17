package io.github.unlp_oo.archetype;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JuegoTest {

	private Juego   juego;
	private Jugador jugador1;
	private Jugador jugador2;
	private Jugada  tijera;
	private Jugada  papel;
	
	
	@BeforeEach
	void setUp() throws Exception {
		jugador1 = new Jugador ("Adrian");
		jugador2 = new Jugador ("Greta");
		tijera   = new Tijera ();
		papel    = new Papel ();
		jugador1.setMiJugada(tijera);
		jugador2.setMiJugada(papel);	
		juego = new Juego();
		juego.setJugador1(jugador1);
		juego.setJugador2(jugador2);
	}
	@Test
		 public void testJuegoGanaTijera() {
			 assertEquals("tijera", juego.jugar());
	}
	@Test
		public void testJuegoGanaPapel() {
			Piedra piedra  = new Piedra ();
			jugador1.setMiJugada(piedra);
			assertEquals("papel", juego.jugar());		
	}
	@Test
		public void testJuegoGanaPiedra() {
			Piedra piedra  = new Piedra ();
			jugador2.setMiJugada(piedra);
			assertEquals("piedra", juego.jugar());		
		}
}
