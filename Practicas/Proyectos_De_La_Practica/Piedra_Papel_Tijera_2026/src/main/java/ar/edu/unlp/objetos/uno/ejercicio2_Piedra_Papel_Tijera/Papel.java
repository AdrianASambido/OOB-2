package ar.edu.unlp.objetos.uno.ejercicio2_Piedra_Papel_Tijera;

public class Papel extends Jugada{

	public Papel() { //Papel cubre piedra y desaprueba Spock.	
		super("papel");
	}
	
	public String jugarContra(Jugada oponente) {
		return oponente.jugarContraPapel(this);	
	}
	
	public String jugarContraPiedra(Jugada oponente) {
		return this.getNombre();
	}
	public String jugarContraTijera(Jugada oponente) {
		return oponente.getNombre();
	}


	public String jugarContraPapel(Jugada oponente) {
		return  this.getNombre();
	}
	
	public String jugarContraLagarto(Jugada oponente) { //Gana lagarto
		return  oponente.getNombre();
	}
	
	public String jugarContraSpock(Jugada oponente) {//Gana papel
		return  this.getNombre();
	}
}
