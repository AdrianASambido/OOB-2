package ar.edu.unlp.objetos.uno.ejercicio2_Piedra_Papel_Tijera;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class PiedraTest {
	
	Piedra escombro, cascote;
	Papel hoja;
	Tijera tijera;
	Spock spock;
	Lagarto lagarto;
	
	@BeforeEach
	void setUp() throws Exception {
		escombro= new Piedra();
		cascote = new Piedra();
		hoja    = new Papel();
		tijera  = new Tijera();
		spock   = new Spock();
		lagarto = new Lagarto();
	}
	
    @Test
    public void testJugarContraPiedra() {
        assertEquals("piedra", escombro.jugarContra(cascote));
    }
    @Test
    public void testJugarContraPapel() {
    	assertEquals("papel", escombro.jugarContra(hoja));
    }
    @Test
    public void testJugarContraTijera() {
    	assertEquals("piedra", escombro.jugarContra(tijera));
    }
    
    @Test
    public void testJugarContraSpock() {
        assertEquals("spock", escombro.jugarContra(spock));
    }
    
    @Test
    public void testJugarContraLagarto() {
        assertEquals("piedra", escombro.jugarContra(lagarto));
    }
   
}
