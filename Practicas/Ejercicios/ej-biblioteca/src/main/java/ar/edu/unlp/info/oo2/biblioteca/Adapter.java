package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Adapter extends VoorheesExporter{
	
	private Object crearSocioJSON(Socio socio) {
		
		JSONObject objeto = new JSONObject (); 
		objeto.put("nombre", socio.getNombre());
		objeto.put("e-mail", socio.getEmail());
		objeto.put("legajo", socio.getLegajo());		
		return objeto;
	}
	@Override
	public String exportar (List <Socio> socios) {
		
		JSONArray arrayJson = new JSONArray();// para generar listas
		socios.stream().forEach(socio -> arrayJson.add(this.crearSocioJSON(socio)));
		return arrayJson.toString(); 
	}

}
