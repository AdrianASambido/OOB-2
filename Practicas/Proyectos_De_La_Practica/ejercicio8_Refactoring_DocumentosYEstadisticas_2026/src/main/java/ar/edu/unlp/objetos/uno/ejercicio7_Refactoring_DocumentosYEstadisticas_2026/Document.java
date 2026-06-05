package ar.edu.unlp.objetos.uno.ejercicio7_Refactoring_DocumentosYEstadisticas_2026;

import java.util.List;

/*Dado el siguiente código implementado en la clase Document y que calcula algunas
 *  estadísticas del mismo:
 */
public class Document {
	List<String> words;

	public long characterCount() {
		long count = this.words.stream().mapToLong(w -> w.length()).sum();//count variable temporal
		return count;
	}
	
	public long calculateAvg() {
		long avgLength = this.words.stream().mapToLong(w -> w.length()).sum() / this.words.size();
		return avgLength; //avgLength variable temporal
	}
	// Resto del código que no importa


//Tareas:
//1. Enumere los code smell y que refactorings utilizará para solucionarlos.
// LOS CODE SMELL: "Temporal en línea (Inline Temp)" campos temporales en ambos 
// métodos El REFACTORING SERÍA "Replace Temp with Query" (Reemplazar variable temporal con una consulta)
// devolver directamente el resultado con una consulta de (stream). 
// El nombre del método calculateAvg no // significativo a simple vista, se podría
// llamar directamente  "calculateAverage()".

//2. Aplique los refactorings encontrados, mostrando el código refactorizado luego de 
//   aplicar cada uno. 

	public long CharacterCount() {
		return this.words.stream().mapToLong(w -> w.length()).sum();
	}

	public long CalculateAvg() { //los puse en mayúsculas para que no tire error
		return this.words.stream().mapToLong(w -> w.length()).sum() / this.words.size();
	}
// Resto del código que no importa

//3. Analice el código original y detecte si existe un problema al calcular las
//   estadísticas. Explique cuál es el error y en qué casos se da ¿El error 
//   identificado sigue presente luego de realizar los refactorings? En caso de que no
// 	 esté presente, ¿en qué momento se resolvió? De acuerdo a lo visto en la teoría,
//   ¿podemos considerar esto un refactoring?
	
	// EL PROBLEMA QUE SE VE ES EN EL método calcuateAvg() si la lista words
	// Llegase a estar vacía se produciría una divición por cero. Pero esto debe
	// quedar así ya que en la refactorización el objetivo fundamental es mejorar
	// la estructura interna y la legibilidad sin alterar su comportamiento externo.
	// Su funcionalidad.
}