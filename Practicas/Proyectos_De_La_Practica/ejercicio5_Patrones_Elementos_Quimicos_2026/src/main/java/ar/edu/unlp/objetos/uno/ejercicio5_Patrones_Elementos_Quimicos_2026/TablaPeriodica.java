package ar.edu.unlp.objetos.uno.ejercicio5_Patrones_Elementos_Quimicos_2026;

public class TablaPeriodica {  ///// FACTORY /////
	
	public ElementoQuimico oxigeno() {
		 ElementoQuimico oxigeno = new ElementoAtomico();
		 return oxigeno;
	}
	
	public ElementoQuimico cloro() {
		return null;
	}
	
	public ElementoQuimico sodio() {
		return null;
	}
	
	public ElementoQuimico calcio() {
		return null;
	}
	
	public ElementoQuimico hidrogeno() {
		ElementoQuimico hidrogeno = new ElementoQuimico();  
		return hidrogeno;
	}
	
	

}
