package ar.edu.unlp.objetos.uno.ejercicio3_Patrones_MediaPlayer_2026;

public class Audio extends Media{

	private String audio; //podría no estar e imprimir directamente un mensaje (un String)
	
	@Override
	public void play() {
		System.out.println(this.audio);
	}	
}
