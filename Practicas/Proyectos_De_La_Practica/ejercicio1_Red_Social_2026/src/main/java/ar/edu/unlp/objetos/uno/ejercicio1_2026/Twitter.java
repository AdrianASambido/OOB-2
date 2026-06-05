package ar.edu.unlp.objetos.uno.ejercicio1_2026;

import java.util.ArrayList;

public class Twitter {

	private ArrayList<Usuario> misUsuarios;
	
	public Twitter(){
		this.misUsuarios = new ArrayList<>();
	}
	
	public Usuario addUsuario(String unNombre) {
		Usuario usuario = null;
		if(!this.verificarUsuario(unNombre)) {
			usuario = new Usuario(unNombre);
			this.misUsuarios.add(usuario);
		}
		return usuario;
	}
		
	public boolean verificarUsuario(String unScreenName) {
		return this.misUsuarios.stream().anyMatch(usuario->usuario.getScreenName().equals(unScreenName));
	}
	
	public boolean deleteUsuario(Usuario unUsuario) {
		return this.misUsuarios.removeIf(usuario->usuario.getScreenName().equals(unUsuario.getScreenName()));
	}

	public ArrayList<Usuario> getMisUsuarios() {
		return misUsuarios;
	}
	
}
