package ar.edu.unlp.objetos.uno.ejercicio1;

import java.util.ArrayList;

public class Usuario {
	
	private String screenName;
	private ArrayList<Tweet> tweets;
	private static final int MAX_LONGITUD = 280;
	private static final int MIN_LONGITUD = 1;
	
	
	public Usuario(String unNombre) {
		this.screenName = unNombre;
	}

	public Tweet addTweet(String unCuerpo) {
		
		if (verificarLongitud(unCuerpo)) {
			Tweet tweet = new Tweet(unCuerpo);
			this.tweets.add(tweet);	
			return tweet;
		}
		return null;
	}

	public ReTweet addReTweet (Tweet unTweet) {
		
		ReTweet reTweet = new ReTweet(unTweet);
		this.tweets.add(unTweet);
		return reTweet; 
	}
	
	private boolean verificarLongitud(String unCuerpo) {
		boolean ok = false;
		
		if ((unCuerpo.length() > MAX_LONGITUD)&&(unCuerpo.length() < MIN_LONGITUD)) {
            throw new IllegalArgumentException("El nombre no puede tener más de " + MAX_LONGITUD + " caracteres."    									+ "ni menos de " + MIN_LONGITUD);
        }
		else 
			ok = true;
		return ok;
	}	
	
	public void deleteTweets() {
		this.tweets.clear();
	}
	
	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public ArrayList<Tweet> getTweets() {
		return tweets;
	}

	public void setTweets(ArrayList<Tweet> tweets) {
		this.tweets = tweets;
	}
}
