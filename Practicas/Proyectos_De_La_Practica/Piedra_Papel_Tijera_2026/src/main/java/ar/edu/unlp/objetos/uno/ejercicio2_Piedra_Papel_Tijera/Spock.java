package ar.edu.unlp.objetos.uno.ejercicio2_Piedra_Papel_Tijera;

public class Spock extends Jugada{ //Spock rompe tijera y vaporiza piedra
	
	public Spock() {
		super("spock");
	}
	
	public String jugarContra(Jugada oponente){
		return oponente.jugarContraSpock(this);
	}
	

	@Override
	public String jugarContraPapel(Jugada oponente) {
		return oponente.getNombre();
	}


	@Override
	public String jugarContraTijera(Jugada oponente) {// gana Spock
		return this.getNombre();
	}


	@Override
	public String jugarContraPiedra(Jugada oponente) {/// gana Spock
		return this.getNombre();
	}
	
	@Override
	public String jugarContraLagarto(Jugada oponente) { //Gana Lagarto
		return  oponente.getNombre();
	}

	@Override
	public String jugarContraSpock(Jugada oponente) {
		return  this.getNombre();
	}

}
