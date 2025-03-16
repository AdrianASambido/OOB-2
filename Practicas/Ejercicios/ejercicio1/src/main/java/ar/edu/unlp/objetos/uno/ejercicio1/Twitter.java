package ar.edu.unlp.objetos.uno.ejercicio1;

import java.util.ArrayList;

public class Twitter {
	
	private ArrayList<Usuario> usuarios;
	
	public Twitter() {
		this.usuarios = new ArrayList<Usuario>();
	}
	
	public Usuario addUsuario(String unScreenName) {
		
		if (this.verificarUsuario(unScreenName)) {
			Usuario unUsuario = new Usuario(unScreenName);
			this.usuarios.add(unUsuario);
			return unUsuario;
		}
		else {
			return null;
		}
	}
	
	private boolean verificarUsuario(String unScreenName) {
		boolean ok = true;
		if (this.usuarios.stream().anyMatch(usuario->usuario.getScreenName() == (unScreenName))) {
			ok = false;
		}
		return ok;
	}

	public void deleteUsuario(Usuario unUsuario) {
		unUsuario.deleteTweets();
		this.usuarios.remove(unUsuario);	
	}

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
}
