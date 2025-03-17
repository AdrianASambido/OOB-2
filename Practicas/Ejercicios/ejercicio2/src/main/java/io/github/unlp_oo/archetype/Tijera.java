package io.github.unlp_oo.archetype;

public class Tijera implements Jugada{
	
	
	public Tijera () {
	}
	
	public String resolverPiedra () {
		return "piedra";
	}
	
	public String resolverPapel() {
		return "tijera";
	}
	
	public String resolverTijera () {
		return "empate"; 
	}
	public String jugarContra(Jugada otraJugada) {
		return otraJugada.resolverTijera();
	}
	
}
