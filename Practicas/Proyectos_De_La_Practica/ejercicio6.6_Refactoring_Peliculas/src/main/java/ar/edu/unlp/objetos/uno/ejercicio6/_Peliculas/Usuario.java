package ar.edu.unlp.objetos.uno.ejercicio6._Peliculas;

public class Usuario {
	Subscripcion tipoSubscripcion;
// ...
	public void setTipoSubscripcion(Subscripcion unTipo) {
		this.tipoSubscripcion = unTipo;
	}
	
	/* Aquí encontramos switch statements "Sentencias switch" lo que en refactoring
	 * debería (Replace Conditional with Polimorfismo) reemplazarse con polimorfismo 
	 * y no estar preguntando que tipo de objeto es. 
	 * Para esto hay que crear subclases y llevar el código de cada sentencia condicional
	 * a cada subclase, además de quitar la variable "costo" del metodo*/
	public double calcularCostoPelicula(Pelicula pelicula) {
		return	this.tipoSubscripcion.calcularCostoPelicula(pelicula);
		}
	
	
}