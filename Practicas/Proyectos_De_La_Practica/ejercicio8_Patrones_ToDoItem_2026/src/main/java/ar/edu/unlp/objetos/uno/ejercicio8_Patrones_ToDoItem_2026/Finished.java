package ar.edu.unlp.objetos.uno.ejercicio8_Patrones_ToDoItem_2026;

import java.time.Duration;

public class Finished extends State{
	
	public Finished() {
	}

	public void start() {	
	}
	
	public void togglePause() {
		
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
