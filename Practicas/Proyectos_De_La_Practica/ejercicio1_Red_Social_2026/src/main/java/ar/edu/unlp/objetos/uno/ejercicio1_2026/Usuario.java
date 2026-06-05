package ar.edu.unlp.objetos.uno.ejercicio1_2026;

import java.util.ArrayList;

public class Usuario {

	private String screenName;
	private ArrayList <Tweet> misTweet;
	
	
	public Usuario(String unScreenName) {
		this.screenName = unScreenName;
		this.misTweet = new ArrayList <>();
	}
	
	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public Tweet addTweet(String unTitulo, String unCuerpo) throws Exception {
		Tweet tweet = null;
		if(validarLongitud(unCuerpo)) {
			tweet = new Tweet(unTitulo, unCuerpo);
			this.misTweet.add(tweet);
		}
		return tweet;
	}
	
	public boolean validarLongitud(String unaLongitud) {
		boolean ok = false;
		if((unaLongitud.length()>0)&&(unaLongitud.length()<281)) {
			ok = true;
		}
		return ok;
	}
	
	public ReTweet addReTweet(Tweet unTweet) {
		ReTweet tweet = new ReTweet(unTweet);//Creo el reTweet y lo retorno
		this.misTweet.add(unTweet);//guardo el tweet
		return tweet; 
	}

	public ArrayList<Tweet> getMisTweet() {
		return misTweet;
	}

}
