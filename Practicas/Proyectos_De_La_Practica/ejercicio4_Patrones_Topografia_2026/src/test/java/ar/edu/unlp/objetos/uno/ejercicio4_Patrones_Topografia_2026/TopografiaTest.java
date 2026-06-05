package ar.edu.unlp.objetos.uno.ejercicio4_Patrones_Topografia_2026;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TopografiaTest {
	
	Topografia agua1, agua2, tierra1, tierra2;
	Mixta mixta1, mixta2, mixta3, mixta4, mixta5, mixta6;
	@BeforeEach
	void setUp() throws Exception {
		agua1  = new Agua_O_Tierra(1);
		agua2  = new Agua_O_Tierra(1);
		tierra1= new Agua_O_Tierra(0);
		tierra2= new Agua_O_Tierra(0); 
		mixta1 = new Mixta();
		mixta2 = new Mixta();
		mixta3 = new Mixta();
		mixta4 = new Mixta();
		mixta5 = new Mixta();
		mixta6 = new Mixta();
		mixta1.agregarTopografia(agua1);
		mixta1.agregarTopografia(agua2);
		
		mixta2.agregarTopografia(agua2);
		mixta2.agregarTopografia(agua1);
		
		mixta3.agregarTopografia(agua1);
		mixta3.agregarTopografia(tierra1);
		mixta3.agregarTopografia(tierra2);
		mixta3.agregarTopografia(agua2);
		
		mixta4.agregarTopografia(agua1);
		mixta4.agregarTopografia(tierra1);
		mixta4.agregarTopografia(tierra2);
		mixta4.agregarTopografia(agua2);
		
		mixta5.agregarTopografia(agua1);
		mixta5.agregarTopografia(tierra1);
		mixta5.agregarTopografia(tierra2);
		mixta5.agregarTopografia(mixta3);
		
		mixta6.agregarTopografia(agua1);
		mixta6.agregarTopografia(tierra1);
		mixta6.agregarTopografia(tierra2);
	//	mixta6.agregarTopografia(mixta3);
	}
	
    @Test
    public void testAgua_O_Tierra() {
        assertEquals( 1, agua1.calcularProporcionDeAgua());
        assertEquals( 0, tierra1.calcularProporcionDeAgua());
        assertTrue(agua1.equals(agua2));
        assertFalse(agua1.soyIgualAMixta(mixta1));
    }
    @Test
    public void testMixta() {
    	assertTrue( mixta1.equals(mixta2));
    	assertTrue(mixta3.equals(mixta4));
    	assertFalse(mixta6.equals(mixta5)); // No son iguales
    	mixta6.agregarTopografia(mixta3);
    	assertTrue(mixta6.equals(mixta5));  // ahora si son iguales
    	assertEquals( 0.375, mixta6.calcularProporcionDeAgua());
    }
}
