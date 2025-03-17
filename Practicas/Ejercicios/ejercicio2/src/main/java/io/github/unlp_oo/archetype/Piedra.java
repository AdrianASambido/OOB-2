package io.github.unlp_oo.archetype;

public class Piedra implements Jugada {
	
	
	public Piedra () {
	}
	
	public String resolverPiedra () {
		return "empate";
	}
	
	public String resolverPapel() {
		return "papel";
	}
	
	public String resolverTijera () {
		return "piedra"; 
	}
	public String jugarContra(Jugada otraJugada) {
		return otraJugada.resolverPiedra();
	}

}
