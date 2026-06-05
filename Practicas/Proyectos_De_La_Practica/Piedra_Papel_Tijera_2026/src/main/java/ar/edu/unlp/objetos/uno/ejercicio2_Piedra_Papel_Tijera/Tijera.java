package ar.edu.unlp.objetos.uno.ejercicio2_Piedra_Papel_Tijera;

public class Tijera extends Jugada{

	public Tijera() { //Tijera corta papel y decapita lagarto.
		super("tijera");
	}
	
	
	public String jugarContra(Jugada oponente){
		return oponente.jugarContraTijera(this);
	}
	

	@Override
	public String jugarContraPapel(Jugada oponente) {
		return this.getNombre();
	}


	@Override
	public String jugarContraTijera(Jugada oponente) {
		return this.getNombre();
	}


	@Override
	public String jugarContraPiedra(Jugada oponente) {
		return oponente.getNombre();
	}
	
	public String jugarContraLagarto(Jugada oponente) { //Gana Tijera
		return  this.getNombre();
	}
	@Override
	public String jugarContraSpock(Jugada oponente) {//gana Spock
		return  oponente.getNombre();
	}
}
