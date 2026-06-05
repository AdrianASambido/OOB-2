package ar.edu.unlp.objetos.uno.ejercicio1_2026;

public class Tweet {

	private String cuerpo;
	private String titulo;
	
	
	public Tweet(String unTitulo, String unCuerpo) throws Exception {
		if (unCuerpo.length()>280) {
			throw new Exception("No se puede crear porque excede la longitud");
		}
		this.cuerpo = unCuerpo;
		this.titulo = unTitulo;	
	}


	public String getCuerpo() {
		return cuerpo;
	}


	public String getTitulo() {
		return titulo;
	}
	
}
