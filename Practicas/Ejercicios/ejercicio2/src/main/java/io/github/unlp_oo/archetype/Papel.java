package io.github.unlp_oo.archetype;

public class Papel implements Jugada{
	
	public Papel () {
	}
	
	public String resolverSpock() {
		return "papel";
	}
	
	public String resolverLagarto() {
		return "lagarto";
	}
	
	public String resolverPiedra () {
		return "papel";
	}
	
	public String resolverPapel() {
		return "empate";
	}
	
	public String resolverTijera () {
		return "tijera"; 
	}
	public String jugarContra(Jugada otraJugada) {
		return otraJugada.resolverPapel();
	}

}
