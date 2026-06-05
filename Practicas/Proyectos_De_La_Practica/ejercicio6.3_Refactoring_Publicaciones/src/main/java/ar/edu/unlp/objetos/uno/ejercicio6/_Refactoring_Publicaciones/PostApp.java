package ar.edu.unlp.objetos.uno.ejercicio6._Refactoring_Publicaciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class PostApp {
	private List<Post> posts;
	/**
	* Retorna los últimos N posts que no pertenecen al usuario user
	*/
	public List<Post> ultimosPosts(Usuario user, int cantidad) {
		List<Post> postsOtrosUsuarios = new ArrayList<Post>();
		for (Post post : this.posts) {
			if (!post.getUsuario().equals(user)) {
				postsOtrosUsuarios.add(post);
			}
		}
		// ordena los posts por fecha
		for (int i = 0; i < postsOtrosUsuarios.size(); i++) {
			int masNuevo = i;
			for(int j= i +1; j < postsOtrosUsuarios.size(); j++) {
				if (postsOtrosUsuarios.get(j).getFecha().isAfter(postsOtrosUsuarios.get(masNuevo).getFecha())) {
					masNuevo = j;
				}
			}
			Post unPost = postsOtrosUsuarios.set(i,postsOtrosUsuarios.get(masNuevo));
			postsOtrosUsuarios.set(masNuevo, unPost);
		}
	List<Post> ultimosPosts = new ArrayList<Post>();
	int index = 0;
	Iterator<Post> postIterator = postsOtrosUsuarios.iterator();
	while (postIterator.hasNext() && index < cantidad) {
		ultimosPosts.add(postIterator.next());
	}
	return ultimosPosts;
	}

  /////////////HASTA ACÁ CÓDIGO ORIGINAL/////////////////

	/**
	* Retorna los últimos N posts que no pertenecen al usuario user
	*/
	public List<Post> ultimosPostss(Usuario user, int cantidad){
		
		List<Post> postsOtrosUsuarios = obtenerPostDeOtrosUsuarios(user); //1° parte
		
		ordenarPostPorFecha(postsOtrosUsuarios);                         //2° parte
		
		return obtenerPostPorCantidad(postsOtrosUsuarios, cantidad);            //3° parte
	}
	
	//////////// primmer metodo extraido ///////////
	private List<Post> obtenerPostDeOtrosUsuarios(Usuario user){
		List<Post> postsOtrosUsuarios = new ArrayList<Post>();
		for (Post post : this.posts) {
			if (!post.getUsuario().equals(user)) {
				postsOtrosUsuarios.add(post);
			}
		}
		return postsOtrosUsuarios; 
	}
	
	/////////// segundo metodo extraido ////////////////////////
	// ordena los posts por fecha
	private void ordenarPostPorFecha(List<Post> postsOtrosUsuarios) { 

		for (int i = 0; i < postsOtrosUsuarios.size(); i++) {
			int masNuevo = i;
			for(int j= i +1; j < postsOtrosUsuarios.size(); j++) {
				if (postsOtrosUsuarios.get(j).getFecha().isAfter(postsOtrosUsuarios.get(masNuevo).getFecha())) {
					masNuevo = j;
				}
			}
			Post unPost = postsOtrosUsuarios.set(i,postsOtrosUsuarios.get(masNuevo));
			postsOtrosUsuarios.set(masNuevo, unPost);
		}
	}
	/////////// tercer metodo extraido ////////////////////////
	// obtiene los primeros n post	
	public List<Post>obtenerPostPorCantidad(List<Post> postsOtrosUsuarios, int cantidad){
		List<Post> ultimosPosts = new ArrayList<Post>();
		int index = 0;
		Iterator<Post> postIterator = postsOtrosUsuarios.iterator();
		while (postIterator.hasNext() && index < cantidad) {
			ultimosPosts.add(postIterator.next());
		}
		return ultimosPosts;
	}
	
	////////HASTA ACÁ EL PRIMER REFACTORING ///////////////
	/*VEMOS QUE LOS 3 METODOS UTILIZAN LOOPS, FOR Y WHILE PARA HACER SU TRABAJO, Y NO 
	  APROBECHAN LAS HERRAMIENTAS DEL SISTEMA, APLICAMOS REPLACE LOOP WITH PIPELINE
	  REEMPLAZANDO LOS FOR Y WHILE POR STREAM*/
	/**
	* Retorna los últimos N posts que no pertenecen al usuario user
	*/
	public List<Post> ultimosPostsss(Usuario user, int cantidad){
		
		//List<Post> postsOtrosUsuarios = obtenerPostDeOtrosUsuarios(user);//1° parte
		//postsOtrosUsuario = ordenarPostPorFecha(postsOtrosUsuarios); 
		
		List<Post> postsOtrosUsuarios = ordenarPostPorFechaS(obtenerPostDeOtrosUsuarios(user));//1° parte  //2° parte
		
		return obtenerPostPorCantidad(postsOtrosUsuarios, cantidad);     //3° parte
	}
	
	//////////// primmer metodo extraido ///////////
	private List<Post> obtenerPostDeOtrosUsuariosS(Usuario user){
		List<Post> postsOtrosUsuarios = new ArrayList<Post>();
		return postsOtrosUsuarios.stream().filter(usuario->!usuario.getUsuario().equals(user)).collect(Collectors.toList()); 
	}
	
	/////////// segundo metodo extraido ////////////////////////
	// ordena los posts por fecha
	private List<Post> ordenarPostPorFechaS(List<Post> postsOtrosUsuarios) { 
		return postsOtrosUsuarios.stream().sorted((ex1, ex2)->
				ex1.getFecha().compareTo(ex2.getFecha()))
				.collect(Collectors.toList());
	// SE APLICO REMPLACE LOOP THIS PIPELINE - TAMBIEN SE DETECTO TEMPORARY FIEL Y SE
	// ELIMINO A TRAVES DEL USO DEL STREAM
	}
	/////////// tercer metodo extraido ////////////////////////
	// obtiene los primeros n post	
	public List<Post>obtenerPostPorCantidadD(List<Post> postsOtrosUsuarios, int cantidad){
		return postsOtrosUsuarios.stream().limit(cantidad).collect(Collectors.toList());
		
		
	}
	
	
	
	
}  