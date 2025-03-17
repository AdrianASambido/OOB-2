package io.github.unlp_oo.archetype;

public interface Jugada {
	
	String resolverPiedra ();
	String resolverPapel();
	String resolverTijera ();
	String jugarContra(Jugada unaJugada);
}
