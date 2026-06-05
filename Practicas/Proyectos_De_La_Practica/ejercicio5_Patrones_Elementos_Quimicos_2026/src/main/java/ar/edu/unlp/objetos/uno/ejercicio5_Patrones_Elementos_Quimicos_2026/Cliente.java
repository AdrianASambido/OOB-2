package ar.edu.unlp.objetos.uno.ejercicio5_Patrones_Elementos_Quimicos_2026;

public class Cliente {

	private TablaPeriodica tabla;
	
	public Cliente() {
		tabla = new TablaPeriodica();
	}
	
	public UnionQuimica agua() {
		this.tabla.oxigeno().add(tabla.hidrogeno()).add(tabla.hidrogeno());
	}
}
