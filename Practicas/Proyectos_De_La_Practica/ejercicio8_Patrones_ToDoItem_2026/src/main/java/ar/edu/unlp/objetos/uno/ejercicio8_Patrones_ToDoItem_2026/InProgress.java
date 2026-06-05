package ar.edu.unlp.objetos.uno.ejercicio8_Patrones_ToDoItem_2026;

import java.time.Duration;

public class InProgress extends State{
	
	
	public InProgress() {
	}
	
	public void start() {	
	}

	public void togglePause() {
		this.getTask().setState(new Paused());
	}

	@Override
	public void addComment(String comment) {
		// TODO Auto-generated method stub
		
	}
	
	public void finish() {
		this.getTask().setState(new Finished());
	}
	
	public Duration workedTime() {
		Duration duration = Duration.between(this.getTask().getStart(), this.getTask().getEnd());
		return duration;
	}
	
}
