package ar.edu.unlp.objetos.uno.ejercicio3_Media_Player_PatronesDD;

public class VideoFile extends Media{
	
	private String video;
	
	public VideoFile(String unVideo) {
		this.video = unVideo;
	}
	
	@Override
	public String play() {
		return this.video;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	
	
	
}
