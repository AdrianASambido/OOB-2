package ar.edu.unlp.objetos.uno.ejercicio2_Piedra_Papel_Tijera;

public class Piedra  extends Jugada{
	
	
	public Piedra() {//Piedra aplasta tijera y aplasta lagarto
		super("piedra");
	}
	
	@Override
	public String jugarContra(Jugada oponente) {
	    return oponente.jugarContraPiedra(this); 
	}


	@Override
	public String jugarContraPapel(Jugada jugada) {
		return jugada.getNombre();
	}

	@Override
	public String jugarContraTijera(Jugada jugada) {
		return this.getNombre();
	}

	@Override
	public String jugarContraPiedra(Jugada jugada) {
		return this.getNombre();
	}
	
	public String jugarContraLagarto(Jugada oponente) { //Gana piedra
		return  this.getNombre();
	}
	
	public String jugarContraSpock(Jugada oponente) {//Gana spock
		return  oponente.getNombre();
	}

}
