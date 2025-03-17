package io.github.unlp_oo.archetype;

public class Jugador {
	
	private String nombre;
	private Jugada miJugada;

	
	public Jugador (String unNombre) {
		this.nombre = unNombre;
	}

	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Jugada getMiJugada() {
		return miJugada;
	}


	public void setMiJugada(Jugada miJugada) {
		this.miJugada = miJugada;
	}

	
	
	
}
