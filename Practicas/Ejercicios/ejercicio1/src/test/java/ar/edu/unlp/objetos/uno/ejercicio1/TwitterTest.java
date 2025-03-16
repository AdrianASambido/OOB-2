package ar.edu.unlp.objetos.uno.ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TwitterTest {
	
	private Twitter twitter;
	
	@BeforeEach
	void setUp() throws Exception{
		twitter    = new Twitter();
		
	}
	@Test
	public void testAddUsuario(){
		Usuario adrian = twitter.addUsuario("Adrian");
		Usuario greta  = twitter.addUsuario("Greta");
		assertEquals("Adrian", adrian.getScreenName());
		assertEquals("Greta", greta.getScreenName());
		assertEquals(2,twitter.getUsuarios().size());
		assertEquals(null, twitter.addUsuario("Greta"));	
	}
	public void testDeleteUsuario() {
		Usuario greta   = twitter.addUsuario("Greta");
		Tweet tweet1    = greta.addTweet("Hola soy mal compi, pero mi compi es re piola");
		Tweet tweet2    = greta.addTweet("Hola soy mal compi, pero mi compi es re piola");
		ReTweet reTweet = greta.addReTweet(tweet1);
		assertEquals( 3, greta.getTweets().size());
		assertEquals("Hola soy mal compi, pero mi compi es re piola", reTweet.getMiTweetOriginal().getCuerpo());
		twitter.deleteUsuario(greta);
		assertEquals(0, greta.getTweets().size());
	}

}
