package ar.edu.unlp.objetos.uno.Refactoring_2026;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
	
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

	public class CharRingTest {
		CharRing ring;
		
		@BeforeEach
		void setUp() throws Exception {
			ring = new CharRing("abc");
		}	
			
	    @Test
	    public void testNextReturnsCorrectSequence() {
	        // Verificamos la primera secuencia
	        assertEquals('a', ring.next(), "El primer carácter debe ser 'a'");
	        assertEquals('b', ring.next(), "El segundo carácter debe ser 'b'");
	        assertEquals('c', ring.next(), "El tercer carácter debe ser 'c'");
	    }

	    @Test
	    public void testRingResetsAtEnd() {
	        // Recorremos el arreglo completo una vez tres lugares
	        ring.next(); // a
	        ring.next(); // b
	        ring.next(); // c
	        assertEquals('a', ring.next(), "Debe reiniciar el ciclo y devolver 'a'");
	        assertEquals('b', ring.next(), "Debe continuar con 'b'");
	    }
	}
	