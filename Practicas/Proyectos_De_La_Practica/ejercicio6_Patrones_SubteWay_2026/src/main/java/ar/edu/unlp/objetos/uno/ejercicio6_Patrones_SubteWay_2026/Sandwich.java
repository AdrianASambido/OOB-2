package ar.edu.unlp.objetos.uno.ejercicio6_Patrones_SubteWay_2026;

public class Sandwich {
	
	private String pan;
	private double precioPan;
	private String aderezo;
	private double precioAderezo;
	private String principal;
	private double precioPrincipal;
	private String extra;
	private double precioExtra;
	
	public Sandwich(){
	}

	public double calcularPrecioTotal() {
		return this.precioPrincipal + this.precioAderezo + this.precioExtra + this.precioPan;
	}
	
	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public double getPrecioPan() {
		return precioPan;
	}

	public void setPrecioPan(double precioPan) {
		this.precioPan = precioPan;
	}

	public String getAderezo() {
		return aderezo;
	}

	public void setAderezo(String aderezo) {
		this.aderezo = aderezo;
	}

	public double getPrecioAderezo() {
		return precioAderezo;
	}

	public void setPrecioAderezo(double precioAderezo) {
		this.precioAderezo = precioAderezo;
	}

	public String getPrincipal() {
		return principal;
	}

	public void setPrincipal(String principal) {
		this.principal = principal;
	}

	public double getPrecioPrincipal() {
		return precioPrincipal;
	}

	public void setPrecioPrincipal(double precioPrincipal) {
		this.precioPrincipal = precioPrincipal;
	}

	public String getExtra() {
		return extra;
	}

	public void setExtra(String extra) {
		this.extra = extra;
	}

	public double getPrecioExtra() {
		return precioExtra;
	}

	public void setPrecioExtra(double precioExtra) {
		this.precioExtra = precioExtra;
	}

	
}
