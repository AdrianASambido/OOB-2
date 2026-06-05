package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class Juridica extends Cliente{

	private String cuit;
	
	public Juridica(String unCuit, String unNombre) {
		super(unNombre);
		this.cuit = unCuit;
	}
	
	public String getCuit() {
		return cuit;
	}
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
}
