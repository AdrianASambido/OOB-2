package ar.edu.unlp.objetos.uno.ejercicio3_Media_Player_PatronesDD;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MediaPlayerTest {

	private Audio mediaAudio;
	private VideoFile mediaVideo;
	private VideoStream mediaStream;
	
	@BeforeEach
	void setUp() throws Exception{
		mediaAudio = new Audio("Highway to hell AC-DC");
		mediaVideo = new VideoFile("The Unforgiven Metalica");
		mediaStream= new VideoStream("i was made for lovin you KISS");
	}
	@Test 
	public void MediaPlayerAudio() {
		assertEquals("Highway to hell AC-DC", mediaAudio.getAudio());
	}
	@Test 
	public void MediaPlayerVideo() {
		assertEquals("The Unforgiven Metalica", mediaVideo.getVideo ());
	}
	@Test 
	public void MediaPlayerStream() {
		assertEquals("i was made for lovin you KISS", mediaStream.getMediaStream());
	}
}
