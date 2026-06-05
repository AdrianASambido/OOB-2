package ar.edu.unlp.objetos.uno.ejercicio3_Patrones_MediaPlayer_2026;

public class VideoFile extends Media{

	private String video; //podría no estar e imprimir directamente un mensaje (un String)
		
	@Override
	public void play() {
		System.out.println(this.video);
	}
}
