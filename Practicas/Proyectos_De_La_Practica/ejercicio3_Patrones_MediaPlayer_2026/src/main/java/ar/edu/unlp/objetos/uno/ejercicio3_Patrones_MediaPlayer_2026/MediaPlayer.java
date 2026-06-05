package ar.edu.unlp.objetos.uno.ejercicio3_Patrones_MediaPlayer_2026;

import java.util.ArrayList;
import java.util.List;

/*Usted ha implementado una clase Media player, para reproducir archivos de audio y video
 *  en formatos que usted ha diseñado. Cada Media se puede reproducir con el mensaje play(). 
 *  Para continuar con el desarrollo, usted desea incorporar la posibilidad de reproducir Video Stream.
 *  Para ello, dispone de la clase VideoStream que pertenece a una librerí a de terceros y usted
 *  no puede ni debe modificarla. El desafío que se le presenta es hacer que la clase MediaPlayer 
 *  pueda interactuar con la clase VideoStream.
 *	La situación se resume en el siguiente diagrama UML:
 * Tareas:
1. Modifique el diagrama de clases UML para considerar los cambios necesarios. Si utiliza patrones de diseño indique los roles en las clases utilizando estereotipos.
2. Implemente en Java
  */

public class MediaPlayer {
	
//	private Media media; //Podría ser así y en el constructor recibe un solo archivo del tipo Media
	private List <Media> unaListaDeArchivosMedia;
	
	public MediaPlayer() {
		this.unaListaDeArchivosMedia = new ArrayList<Media>();
	}
	
	public MediaPlayer(Media unArchivo) {
		this.unaListaDeArchivosMedia.add(unArchivo);
	}
	
	public void play() {
		this.unaListaDeArchivosMedia.stream().forEach(archivo->archivo.play());
	}
}
