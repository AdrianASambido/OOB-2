package ar.edu.unlp.objetos.uno.Refactoring_2026;

public class CharRing extends Ring {
    private char[] source;

    public CharRing(String src) {
        this.source = src.toCharArray();//Para mi
        this.length = source.length;    //Para el padre
    }

    public char next() {
        return source[super.updateIdx()];//Reutilizamos la lógica del padre
    }
}