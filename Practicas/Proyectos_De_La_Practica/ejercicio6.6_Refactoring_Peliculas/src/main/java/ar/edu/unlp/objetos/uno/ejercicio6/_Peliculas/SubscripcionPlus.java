package ar.edu.unlp.objetos.uno.ejercicio6._Peliculas;

public class SubscripcionPlus implements Subscripcion {

	@Override
	public double calcularCostoPelicula(Pelicula pelicula) {
		return pelicula.getCosto();
	}
}
