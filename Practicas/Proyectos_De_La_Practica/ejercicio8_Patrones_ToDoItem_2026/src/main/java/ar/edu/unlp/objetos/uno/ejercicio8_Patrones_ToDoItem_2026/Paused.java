package ar.edu.unlp.objetos.uno.ejercicio8_Patrones_ToDoItem_2026;

import java.time.Duration;

public class Paused extends State{
	
	public Paused () {
	}
	
	public void start() {	
	}
	
	public void togglePause() {
		this.getTask().setState(new InProgress());
		this.addComment("La causa es");
	}

	@Override
	public void addComment(String comment) {
		this.getTask().addComment(comment);		
	}
	
	public void finish() {
	}
	
	public Duration workedTime() {
		Duration duration = Duration.between(this.getTask().getStart(), this.getTask().getEnd());
		return duration;
	}
}
