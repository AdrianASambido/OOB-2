package ar.edu.unlp.objetos.uno.ejercicio6._Refactoring_2026;

public class Juego {
	
		// ......El mal olor (code smell) es nombres poco descriptivos
		public void incrementarPuntaje(Jugador j) {
			j.puntuacion = j.puntuacion + 100;
		}
		public void decrementarPuntaje(Jugador j) {
			j.puntuacion = j.puntuacion - 50;
		}

}
