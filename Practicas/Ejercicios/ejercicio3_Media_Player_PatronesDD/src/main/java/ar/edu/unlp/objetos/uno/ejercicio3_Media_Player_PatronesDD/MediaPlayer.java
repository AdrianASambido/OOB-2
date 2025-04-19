package ar.edu.unlp.objetos.uno.ejercicio3_Media_Player_PatronesDD;


public class MediaPlayer {

	private Media media;
	
	public MediaPlayer (Media media) {
		this.media = media;
	}
	
	public MediaPlayer() {
	}
	
	public String play() {
		return media.play(); 
	}

	public Media getMedia() {
		return media;
	}

	public void setMedia(Media media) {
		this.media = media;
	}
	
	
}
