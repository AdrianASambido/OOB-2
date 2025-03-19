package io.github.unlp_oo.archetype;

public class Spock implements Jugada{
	
	
	public Spock () {
	}
	
	public String resolverSpock() {
		return "empate";
	}
	
	public String resolverLagarto() {
		return "lagarto";
	}
	
	public String resolverPiedra () {
		return "spock";
	}
	
	public String resolverTijera () {
		return "spock";
	}
	
	public String resolverPapel () {
		return "papel";
	}
	
	public String jugarContra(Jugada otraJugada) {
		return otraJugada.resolverSpock();
	}


}
