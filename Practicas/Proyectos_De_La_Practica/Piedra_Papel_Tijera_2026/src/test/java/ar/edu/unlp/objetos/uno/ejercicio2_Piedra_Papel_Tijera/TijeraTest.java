package ar.edu.unlp.objetos.uno.ejercicio2_Piedra_Papel_Tijera;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TijeraTest {
	

	Piedra escombro;
	Papel hoja;
	Tijera tijera, tijerita;
	Spock spock;
	Lagarto lagarto;
	
	@BeforeEach
	void setUp() throws Exception {
		escombro= new Piedra();
		tijerita= new Tijera();
		hoja    = new Papel();
		tijera  = new Tijera();
		spock   = new Spock();
		lagarto = new Lagarto();
	}


	@Test
    public void testJugarContraTijera() {
    	assertEquals("tijera", tijera.jugarContra(tijerita));
    }
    @Test
    public void testJugarContraPiedra() {
        assertEquals("piedra", tijera.jugarContra(escombro));
    }
    @Test
    public void testJugarContraPapel() {
    	assertEquals("tijera", tijera.jugarContra(hoja));
    }
    
    @Test
    public void testJugarContraSpock() {
        assertEquals("spock", tijera.jugarContra(spock));
    }
    
    @Test
    public void testJugarContraLagarto() {
        assertEquals("tijera", tijera.jugarContra(lagarto));
    }
   
    
}
