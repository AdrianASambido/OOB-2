package ar.edu.unlp.objetos.uno.ejercicio2_Piedra_Papel_Tijera;

public abstract class Jugada {
	
	private String nombre;
	
	public Jugada(String unNombre) {
		this.nombre = unNombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public abstract String jugarContra(Jugada jugada);
	
	public abstract String jugarContraPapel(Jugada jugada);
	
	public abstract String jugarContraTijera(Jugada jugada);
	
	public abstract String jugarContraPiedra(Jugada jugada);
	
	public abstract String jugarContraLagarto(Jugada jugada);
	
	public abstract String jugarContraSpock(Jugada jugada);

}
