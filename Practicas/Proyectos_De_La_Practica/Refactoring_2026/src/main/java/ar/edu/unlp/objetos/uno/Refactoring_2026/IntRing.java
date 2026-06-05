package ar.edu.unlp.objetos.uno.Refactoring_2026;

public class IntRing extends Ring {
    private int[] source;

    public IntRing(int[] src) {
        this.source = src;        // Para mi
        this.length = src.length; // Para el padre
    }

    public int next() {
        return source[super.updateIdx()]; //Reutilizamos la lógica del padre
    }
}
	
