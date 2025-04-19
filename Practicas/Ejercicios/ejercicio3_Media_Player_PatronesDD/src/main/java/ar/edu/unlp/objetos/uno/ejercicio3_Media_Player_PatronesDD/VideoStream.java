package ar.edu.unlp.objetos.uno.ejercicio3_Media_Player_PatronesDD;

public class VideoStream {
	private String videoStream;
	
	public VideoStream (String unMedia){
		this.videoStream = unMedia;
	}

	public String reproduce() {
		return videoStream; 
	}

	public String getMediaStream() {
		return videoStream;
	}

	public void setMediaStream(String media) {
		this.videoStream = media;
	}
	
}