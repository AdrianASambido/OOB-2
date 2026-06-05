package ar.edu.unlp.objetos.uno.ejercicio8_Patrones_ToDoItem_2026;

public class Pending extends State{

	
	public Pending(ToDoItem task) {
		super(task);
	}
	
	public void start() {
		this.getTask().setState(new InProgress());
		this.getTask().setName("EnProceso");
	}
	
	public void togglePause() {
		
	}

	@Override
	public void addComment(String comment) {
		// TODO Auto-generated method stub
		
	}
	
	public void finish() {	
	}
	
}
