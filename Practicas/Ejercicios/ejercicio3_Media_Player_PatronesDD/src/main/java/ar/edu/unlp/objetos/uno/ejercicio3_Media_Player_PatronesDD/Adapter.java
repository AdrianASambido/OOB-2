package ar.edu.unlp.objetos.uno.ejercicio3_Media_Player_PatronesDD;

public abstract class Adapter extends Media{
	
	private VideoStream vSm;
	
	
	public Adapter (VideoStream unVsm) {
		this.vSm = unVsm;
	}
		
	@Override
	public String play() {
		return this.vSm.reproduce();
	}
}