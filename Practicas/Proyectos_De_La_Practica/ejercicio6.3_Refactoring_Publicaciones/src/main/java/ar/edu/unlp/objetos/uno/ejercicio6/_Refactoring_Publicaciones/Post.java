package ar.edu.unlp.objetos.uno.ejercicio6._Refactoring_Publicaciones;

import java.time.LocalDateTime;

public class Post {
	private String texto;
	private LocalDateTime fecha;
	private Usuario usuario;
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	
	

}
