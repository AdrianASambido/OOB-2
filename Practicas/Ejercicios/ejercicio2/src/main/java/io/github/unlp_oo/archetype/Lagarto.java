package io.github.unlp_oo.archetype;

public class Lagarto implements Jugada{

	
	public Lagarto () {	
	}
	
	public String resolverSpock() {
		return "lagarto";
	}
	
	public String resolverLagarto() {
		return "empate";
	}
	
	public String resolverPiedra () {
		return "piedra";
	}
	
	public String resolverTijera () {
		return "tijera";
	}
	
	public String resolverPapel () {
		return "lagarto";
	}
	
	public String jugarContra(Jugada otraJugada) {
		return otraJugada.resolverLagarto();
	}

	
}
