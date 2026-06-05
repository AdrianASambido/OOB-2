package ar.edu.unlp.objetos.uno.ejercicio1_2026;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class UsuarioTest {
	
	Usuario james, guido;
	
	@BeforeEach
	void setUp() throws Exception {
		james = new Usuario("james");
		guido = new Usuario("guido");	
	}
	
    @Test
    public void testNombreCompleto() {
        assertEquals("james", james.getScreenName());
        assertEquals("guido", guido.getScreenName());
    }
    @Test
    public void testAddTweet() {
    	Tweet tweet  = james.addTweet("el Mejor", "el mejor de los mejores");
		Tweet tweet2 = james.addTweet("casi Mejor", "el mejor del mejores");
		ReTweet rtweet = guido.addReTweet(tweet);
    	assertEquals("el Mejor", tweet.getTitulo());
    	assertEquals("el mejor de los mejores", tweet.getCuerpo());   
    	assertEquals(2, james.getMisTweet().size());
    	assertEquals(1, guido.getMisTweet().size());
    }
    @Test
    public void testAddReTweet() {
    	Tweet tweet     = guido.addTweet("el Mejor", "el mejor de los mejores");
    	Tweet tweet2    = guido.addTweet("el Mejor", "el mejor de los mejores");
		ReTweet rtweet2 = james.addReTweet(tweet);
    	ReTweet rTweet3 = james.addReTweet(tweet2);
    	assertEquals(2, guido.getMisTweet().size());
    	assertEquals(2, james.getMisTweet().size());  	
    }
     
}
