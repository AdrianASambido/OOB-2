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
		juego    = new Juego();
		juego.setJugador1(jugador1);
		juego.setJugador2(jugador2);
	}
	@Test
	public void testJuegoGanaTijera() {
		 assertEquals("tijera", juego.jugar());
	}
	@Test
	public void testJuegoPierdeTijera() {
		Piedra piedra = new Piedra();
		jugador2.setMiJugada(piedra);
		assertEquals("piedra", juego.jugar());
	}
	@Test
	public void testJuegoEmpataTijera() {
		Tijera tijera = new Tijera();
		jugador2.setMiJugada(tijera);
		assertEquals("empate", juego.jugar());
	}
	@Test
	public void testJuegoGanaPapel() {
		Piedra piedra  = new Piedra ();
		jugador1.setMiJugada(piedra);
		assertEquals("papel", juego.jugar());		
	}
	@Test
	public void testJuegoPierdePapel() {
		assertEquals("tijera", juego.jugar());		
}
	@Test
	public void testJuegoEmpataPapel() {
		Papel papel = new Papel();
		jugador1.setMiJugada(papel);
		assertEquals("empate", juego.jugar());
	}
	
	@Test
	public void testJuegoGanaPiedra() {
		Piedra piedra  = new Piedra ();
		jugador2.setMiJugada(piedra);
		assertEquals("piedra", juego.jugar());		
	}
	@Test
	public void testJuegoPierdePiedra() {
		Piedra piedra  = new Piedra ();
		jugador1.setMiJugada(piedra);
		assertEquals("papel", juego.jugar());		
	}
	@Test
	public void testJuegoEmpataPiedra() {
		Piedra piedra  = new Piedra ();
		jugador1.setMiJugada(piedra);
		jugador2.setMiJugada(piedra);
		assertEquals("empate", juego.jugar());
	}
	
	@Test
	public void testJuegoGanaSpock() {
		Piedra piedra = new Piedra ();
		Spock spock   = new Spock();
		jugador1.setMiJugada(piedra);
		jugador2.setMiJugada(spock);
		assertEquals("spock", juego.jugar());			
	}
	@Test
	public void testJuegoPierdeSpock() {
		Papel papel = new Papel ();
		Spock spock = new Spock();
		jugador1.setMiJugada(papel);
		jugador2.setMiJugada(spock);
		assertEquals("papel", juego.jugar());			
	}
	@Test
	public void testJuegoEmpateSpock() {
		Spock spock = new Spock();
		jugador1.setMiJugada(spock);
		jugador2.setMiJugada(spock);
		assertEquals("empate", juego.jugar());		
	}
	@Test
	public void testJuegoGanaLagarto() {
		Papel papel     = new Papel ();
		Lagarto lagarto = new Lagarto();
		jugador1.setMiJugada(papel);
		jugador2.setMiJugada(lagarto);
		assertEquals("lagarto", juego.jugar());	
	}
	@Test
	public void testJuegoPierdeLagarto() {
		Piedra piedra   = new Piedra();
		Lagarto lagarto = new Lagarto();
		jugador1.setMiJugada(piedra);
		jugador2.setMiJugada(lagarto);
		assertEquals("piedra", juego.jugar());	
	}
	@Test
	public void testJuegoEmpataLagarto() {
		Lagarto lagarto = new Lagarto();
		jugador1.setMiJugada(lagarto);
		jugador2.setMiJugada(lagarto);
		assertEquals("empate", juego.jugar());	
	}
	
}
