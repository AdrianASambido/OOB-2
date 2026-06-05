package ar.edu.unlp.objetos.uno.ejercicio6._Peliculas;

public class SubscripcionFamilia implements Subscripcion {

	//esta lógica deberia ser ejecutada en la clase Pelicula ya que es quien tiene
	//la información para obtener este resultado. "Feature Envy".
	//Asi que aplicamos "Extract Method"
	@Override
	public double calcularCostoPelicula(Pelicula pelicula) {
		return (pelicula.calcularCostoPorCargoExtra()) * 0.90;
	}

}
