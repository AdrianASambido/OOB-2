package ar.edu.unlp.objetos.uno.ejercicio3_Patrones_MediaPlayer_2026;

public class AdapterSream extends Media{
	 
	private VideoStream visor; // Esto está bien?
	
	public AdapterSream(VideoStream unVisor) {
		this.visor = unVisor;
	}
	
	@Override
	public void play() {
		this.visor.reproduce();
	}
}
