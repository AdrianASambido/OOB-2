package ar.edu.unlp.objetos.uno.ejercicio5_Patrones_Elementos_Quimicos_2026;

public class ElementoAtomico extends ElementoQuimico{

	private String simbolo;
	
	public String formula() {
		return this.simbolo; 
	}
	
	public boolean esValida() {
		return true;
	}

	@Override
	public boolean esValida(ElementoQuimico primerElemento, ElementoQuimico segundoElemento) {
		return false;
	}
	
}
