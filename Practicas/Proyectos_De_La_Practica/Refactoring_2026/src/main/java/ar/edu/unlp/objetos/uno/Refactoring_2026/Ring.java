package ar.edu.unlp.objetos.uno.Refactoring_2026;
	
public abstract class Ring {
    private int idx = 0; 
    private int length;  // Necesitamos saber el largo del arreglo SI

    
    
    public int updateIdx() {// Método en común para las hijas
	    if (idx >= length) {
	       idx = 0;
	    }
	    return idx++;
	}
	
}

/* Que conviene, poner las variables como protected o en los constructores de las hijas
 * hacer super de la longitud de los arreglos? ..Porque probé ponerla como privada 
 * y tira error
 * .*/
