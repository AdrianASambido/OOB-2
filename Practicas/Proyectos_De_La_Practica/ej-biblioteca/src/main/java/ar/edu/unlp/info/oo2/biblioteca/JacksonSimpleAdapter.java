package ar.edu.unlp.info.oo2.biblioteca;
/*
 *La librería JSON.simple es liviana y muy utilizada para leer y escribir archivos JSON.
 *Entre las clases que contiene se encuentran:
 *JSONObject : Usada para representar los datos que se desean exportar de un objeto. Esta clase 
 *provee el método put(Object, Object) para agregar los campos al mismo. Aunque el primer argumento 
 *sea de tipo Object, usted debe proveer el nombre del atributo como un string. El segundo argumento
 * contendrá el valor del mismo. Por ejemplo, si point es una instancia de JSONObject, se podrá 
 * ejecutar point.put(“x”, 50);
 *JSONArray: Usada para generar listas. Provee el método add(Object) para agregar los elementos a 
 *la lista, los cuales, para este caso, deben ser JSONObject.
 *Ambas clases implementan el mensaje toJSONString() el cual retorna un String con la representación 
 *JSON del objeto.
 *JSONParser : Usada para recuperar desde un String con formato JSON los elementos que lo componen.
  */

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JacksonSimpleAdapter extends VoorheesExporter{
	
	@Override
	public String exportar(List<Socio> socios) {
		JSONArray listaJson = new JSONArray(); 
	    socios.stream().forEach(socio-> listaJson.add(this.agregarSocio(socio)));
		return listaJson.toJSONString();
	}
	
	private  JSONObject agregarSocio(Socio unSocio) {
		JSONObject socio = new JSONObject();
		socio.put("nombre", unSocio.getNombre());
		socio.put("email", unSocio.getEmail());
		socio.put("legajo", unSocio.getLegajo());
		return socio;
	}

}
