package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.json.simple.parser.JSONParser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BibliotecaTest {
	
	Biblioteca biblioteca;
	JSONParser formatoJson;
	Socio socio;
	Socio socio2;
	
	@BeforeEach
	void setUp() throws Exception {
		biblioteca = new Biblioteca();	
		socio = new Socio("Arya Stark", "needle@stark.com", "5234-5");
		socio2 = new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2");
		biblioteca.agregarSocio(socio);
		biblioteca.agregarSocio(socio2);
		formatoJson = new JSONParser ();		
	}
	
	@Test
	public void testExporter()throws Exception {
		VoorheesExporter adapter = new VoorheesExporter();
		String datos = "[\n"
				+ "	{\n"
				+ "		\"nombre\": \"Arya Stark\",\n"
				+ "		\"email\": \"needle@stark.com\",\n"
				+ "		\"legajo\": \"5234-5\"\n"
				+ "	},\n"
				+ "	{\n"
				+ "		\"nombre\": \"Tyron Lannister\",\n"
				+ "		\"email\": \"tyron@thelannisters.com\",\n"
				+ "		\"legajo\": \"2345-2\"\n"
				+ "	}\n"
				+ "]\n"
				+ "";
		biblioteca.setExporter(adapter);
		assertEquals(formatoJson.parse(datos), formatoJson.parse(biblioteca.exportarSocios()));	
	}
	
}
