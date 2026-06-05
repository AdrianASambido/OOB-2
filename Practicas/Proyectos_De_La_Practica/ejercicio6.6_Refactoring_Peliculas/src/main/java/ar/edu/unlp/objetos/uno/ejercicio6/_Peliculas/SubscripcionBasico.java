package ar.edu.unlp.objetos.uno.ejercicio6._Peliculas;

public class SubscripcionBasico implements Subscripcion{
	//esta lógica deberia ser ejecutada en la clase Pelicula. "Feature Envy".
	//Asi que aplicamos "Extract Method" 
/*	@Override
	public double calcularCostoPelicula(Pelicula pelicula) {
		return pelicula.getCosto() + pelicula.calcularCargoExtraPorEstreno();
	}*/
	
	//refactirizado
	@Override
	public double calcularCostoPelicula(Pelicula pelicula) {
		return pelicula.calcularCostoPorCargoExtra();
	}
}
