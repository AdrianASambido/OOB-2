package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class Fisica extends Cliente{

	private String dni;
	
	public Fisica(String dni, String nombre) {
		super(nombre);
		this.dni = dni;
	}
		
		
	
	public String getDNI() {
		return dni;
	}
	public void setDNI(String dni) {
		this.dni = dni;
	}
}
