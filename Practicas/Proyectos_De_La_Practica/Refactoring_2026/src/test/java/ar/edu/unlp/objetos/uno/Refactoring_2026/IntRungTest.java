package ar.edu.unlp.objetos.uno.Refactoring_2026;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IntRungTest {
	
	IntRing ring;
	int[] scr;
	
	@BeforeEach
	void setUp() throws Exception {
		scr = new int[3];
		for(int i=0; i<3; i++) {
			scr[i] = i+1;
		}
		
		ring = new IntRing(scr);
	}	
		
    @Test
    public void testNextReturnsCorrectSequence() {
        // Verificamos la primera secuencia
        assertEquals( 1, ring.next(), "El primer integer debe ser '1'");
        assertEquals( 2, ring.next(), "El segundo integer debe ser '2'");
        assertEquals( 3, ring.next(), "El tercer integer debe ser '3'");
    }

    @Test
    public void testRingResetsAtEnd() {
        // Recorremos el arreglo completo una vez tres lugares
        ring.next(); // 1
        ring.next(); // 2
        ring.next(); // 3
        assertEquals( 1, ring.next(), "Debe reiniciar el ciclo y devolver '1'");
        assertEquals( 2, ring.next(), "Debe continuar con '2'");
    }
}

