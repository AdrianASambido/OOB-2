package ar.edu.unlp.objetos.uno.ejercicio8_Patrones_ToDoItem_2026;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.ArrayList;
import java.util.List;

/* Se desea definir un sistema de seguimiento de tareas similar a Jira1.
 * En este sistema hay tareas en las cuales se puede definir el nombre y una serie de comentarios. 
 * Las tareas atraviesan diferentes etapas a lo largo de su ciclo de vida y ellas son: pending,
 * in-progress, paused y finished. Cada tarea debe estar modelada mediante la clase ToDoItem con 
 * el siguiente protocolo:
*/
public class ToDoItem {
	
	private String name;
	private State state;
	private List<String> commentaries;
	private LocalDateTime start;
	private LocalDateTime end;
	/**
	* Instancia un ToDoItem nuevo en estado pending con <name> como nombre.
	*/
	public ToDoItem(String unName) {
		this.name = unName;
		this.state = new Pending();
		this.commentaries = new ArrayList<>(); 	
	}
	/**
	* Pasa el ToDoItem a in-progress, siempre y cuando su estado actual sea
	* pending. Si se encuentra en otro estado, no hace nada.
	*/
	
	public void start() {
		this.state.start();
	}
	/**
	* Pasa el ToDoItem a paused si su estado es in-progress, o a in-progress sí * su estado es paused. Caso contrario (pending o finished) genera un error
	* informando la causa específica del mismo.
	*/
	public void togglePause() {
		this.state.togglePause();
	}
	/**
	* Pasa el ToDoItem a finished, siempre y cuando su estado actual sea
	* in-progress o paused. Si se encuentra en otro estado, no hace nada.
	*/
	public void finish() {
		this.state.finish();
	}
	/**
	* Retorna el tiempo que transcurrió desde que se inició el ToDoItem (start)
	* hasta que se finalizó. En caso de que no esté finalizado, el tiempo que
	* haya transcurrido hasta el momento actual. Si el ToDoItem no se inició,
	* genera un error informando la causa específica del mismo.
	*/
	public Duration workedTime() {
		Duration duration = Duration.between(this.start, this.end);
		return duration;
	}
	/**
	* Agrega un comentario al ToDoItem siempre y cuando no haya finalizado. Caso
	* contrario no hace nada."	
	*/
	public void addComment(String comment) {
		this.commentaries.add(comment);		
	}
	
	/*Nota: para generar o levantar un error debe utilizar la expresión
	 *throw new RuntimeException("Este es mi mensaje de error");
	 * El mensaje de error específico que se espera en este ejercicio debe ser descriptivo 
	 * del caso. Por ejemplo, para el método togglePause() , el mensaje de error debe indicar 
	 * que el ToDoItem no se encuentra en in-progress o paused: throw new RuntimeException
	 * ("El objeto ToDoItem no se encuentra en pause o in-progress");
	Tareas:
	1. Modele una solución orientada a objetos para el problema planteado utilizando un 
	 * diagrama de clases UML. Si utilizó algún patrón de diseño indique cuáles son los 
	 * participantes en su modelo de acuerdo a Gamma et al.
	2. Implemente su solución en Java. Para comprobar cómo funciona recomendamos usar test cases.
	*/
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public LocalDateTime getStart() {
		return start;
	}
	public void setStart(LocalDateTime start) {
		this.start = start;
	}
	public LocalDateTime getEnd() {
		return end;
	}
	public void setEnd(LocalDateTime end) {
		this.end = end;
	}
	
}
