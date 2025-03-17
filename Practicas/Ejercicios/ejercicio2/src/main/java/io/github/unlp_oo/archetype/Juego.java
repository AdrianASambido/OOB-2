package io.github.unlp_oo.archetype;

public class Juego {
	
	private Jugador jugador1;
	private Jugador jugador2;
	
	public Juego () {	
	}
	
	public String jugar() {
	
		return this.jugador1.getMiJugada().jugarContra(this.jugador2.getMiJugada());	
	}

	public Jugador getJugador1() {
		return jugador1;
	}

	public void setJugador1(Jugador jugador1) {
		this.jugador1 = jugador1;
	}

	public Jugador getJugador2() {
		return jugador2;
	}

	public void setJugador2(Jugador jugador2) {
		this.jugador2 = jugador2;
	}
	
	
	
}
