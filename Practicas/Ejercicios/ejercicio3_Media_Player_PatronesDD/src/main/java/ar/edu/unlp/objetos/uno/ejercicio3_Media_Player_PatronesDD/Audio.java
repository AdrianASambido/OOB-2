package ar.edu.unlp.objetos.uno.ejercicio3_Media_Player_PatronesDD;

public class Audio extends Media{
	private String audio;
	
	
	public Audio (String unAudio) {
		this.audio = unAudio;
	}
	@Override
	public String play() {
		return this.audio;
	}

	public String getAudio() {
		return audio;
	}

	public void setAudio(String audio) {
		this.audio = audio;
	}

	
}
