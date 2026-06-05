package ar.edu.unlp.objetos.uno.ejercicio2_Piedra_Papel_Tijera;

public class Lagarto extends Jugada{ //Lagarto come papel y envenena Spock.
	
	public Lagarto() {
		super("lagarto");
	}
	
	public String jugarContra(Jugada oponente){
		return oponente.jugarContraLagarto(this);
	}
	

	@Override
	public String jugarContraPapel(Jugada oponente) {// gana lagarto
		return this.getNombre();
	}


	@Override
	public String jugarContraTijera(Jugada oponente) {
		return oponente.getNombre();
	}


	@Override
	public String jugarContraPiedra(Jugada oponente) {
		return oponente.getNombre();
	}
	
	public String jugarContraLagarto(Jugada oponente) { //Gana empate
		return  this.getNombre();
	}
	
	public String jugarContraSpock(Jugada oponente) {//Gana Lagarto
		return  this.getNombre();
	}

}
