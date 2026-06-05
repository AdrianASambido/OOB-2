package ar.edu.unlp.objetos.uno.ejercicio8_Patrones_ToDoItem_2026;

import java.time.Duration;

// import javax.management.loading.PrivateClassLoader;

public abstract class State {
	
	private ToDoItem task;
	
	public State(ToDoItem a_task) {
		this.task = a_task;
	}
	
	public Duration workedTime() {
		return Duration.between(this.task.getStart(),this.task.getEnd()); 
	}
		
	abstract public void start();
	
	abstract public void togglePause();
		
	abstract public void addComment(String comment); 
	
	abstract public void finish();

	public ToDoItem getTask() {
		return task;
	}

	public void setTask(ToDoItem task) {
		this.task = task;
	}
	
	
	

}
