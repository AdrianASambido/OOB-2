package ar.edu.unlp.objetos.uno.ejercicio5_Patrones_Elementos_Quimicos_2026;

public abstract class ElementoQuimico {
	
	private String nombre;
	private int pesoAtomico;
	private int cargaElectrica;
	private boolean esMetal;
	
	public ElementoQuimico() {
	}

	public void setPesoAtomico(int pesoAtomico) {
		this.pesoAtomico = pesoAtomico;
	}

	public void setEsMetal(boolean esMetal) {
		this.esMetal = esMetal;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPesoAtomico() {
		return pesoAtomico;
	}

	public boolean isEsMetal() {
		return esMetal;
	}

	public String getNombre() {
		return nombre;
	}

	
	
	public int getCargaElectrica() {
		return cargaElectrica;
	}

	public void setCargaElectrica(int cargaElectrica) {
		this.cargaElectrica = cargaElectrica;
	}

	public abstract String formula();
	
	public abstract boolean esValida(ElementoQuimico primerElemento, ElementoQuimico segundoElemento);
	
}
