package ar.edu.unlp.objetos.uno.ejercicio2_Piedra_Papel_Tijera;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PapelTest {

	Piedra escombro;
	Papel hoja, hojita;
	Tijera tijera;
	Spock spock;
	Lagarto lagarto;
	
	@BeforeEach
	void setUp() throws Exception {
		escombro= new Piedra();
		hojita  = new Papel();
		hoja    = new Papel();
		tijera  = new Tijera();
		spock   = new Spock();
		lagarto = new Lagarto();
	}


	 @Test
	    public void testJugarContraPapel() {
	    	assertEquals("papel", hoja.jugarContra(hojita));
	    }
	@Test
    public void testJugarContraTijera() {
    	assertEquals("tijera", hoja.jugarContra(tijera));
    }
    @Test
    public void testJugarContraPiedra() {
        assertEquals("papel", hoja.jugarContra(escombro));
    }
    
    @Test
    public void testJugarContraSpock() {
        assertEquals("papel", hoja.jugarContra(spock));
    }
    
    @Test
    public void testJugarContraLagarto() {
        assertEquals("lagarto", hoja.jugarContra(lagarto));
    }
   


}
