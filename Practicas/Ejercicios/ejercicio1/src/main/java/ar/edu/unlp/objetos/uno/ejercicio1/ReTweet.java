package ar.edu.unlp.objetos.uno.ejercicio1;

public class ReTweet {
	
	private Tweet miTweetOriginal;
	
	public ReTweet (Tweet unTweet) {
		this.miTweetOriginal = unTweet;
	}

	public Tweet getMiTweetOriginal() {
		return miTweetOriginal;
	}
}
