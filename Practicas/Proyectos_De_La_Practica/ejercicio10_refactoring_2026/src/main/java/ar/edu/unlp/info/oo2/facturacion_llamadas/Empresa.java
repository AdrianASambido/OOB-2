package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

/*
 En el material adicional encontrará una aplicación que registra y factura llamadas 
 telefónicas. Para lograr tal objetivo, la aplicación permite administrar números 
 telefónicos, como así también clientes asociados a un número. Los clientes pueden
 ser personas físicas o jurídicas. Además, el sistema permite registrar las llamadas 
 realizadas, las cuales pueden ser nacionales o internacionales. Luego, a partir de 
 las llamadas, la aplicación realiza la facturación, es decir, calcula el monto que
 debe abonar cada cliente.
 Importe el material adicional provisto por la cátedra y analícelo para identificar 
 y corregir los malos olores que presenta. En forma iterativa, realice 
 los siguientes pasos:
  (i) indique el mal olor,
  (ii) indique el refactoring que lo corrige,
  (iii) aplique el refactoring (modifique el código).
  (iv) asegúrese de que los tests provistos corran exitosamente.
  Si vuelve a encontrar un mal olor, retorne al paso (i).
  Tareas:
  ● Describa la solución inicial con un diagrama de clases UML.
  ● Documente la secuencia de refactorings aplicados, como se indica previamente.
  ● Describa la solución final con un diagrama de clases UML.*/

public class Empresa {
	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<Llamada> llamadas = new ArrayList<Llamada>();
	private GestorNumerosDisponibles guia = new GestorNumerosDisponibles();

	static double descuentoJur = 0.15;
	static double descuentoFis = 0;

	public boolean agregarNumeroTelefono(String str) {
		boolean encontre = guia.getLineas().contains(str);
		if (!encontre) { //si no existe lo agrego
			guia.getLineas().add(str);
			encontre= true;
			return encontre;
		}
		else {
			encontre= false;
			return encontre;
		}
	}

	public String obtenerNumeroLibre() {
		return guia.obtenerNumeroLibre();
	}

	public Cliente registrarUsuario(Cliente persona) {
		String tel = this.obtenerNumeroLibre();
		persona.agregarTelefono(tel);
		this.clientes.add(persona);
		return persona;
	}
	

	public Llamada registrarLlamada(Cliente origen, Cliente destino, String t, int duracion) {
		Llamada llamada = new Llamada(t, origen.getNumeroTelefono(), destino.getNumeroTelefono(), duracion);
		llamadas.add(llamada);
		origen.llamadas.add(llamada);
		return llamada;
	}

	public double calcularMontoTotalLlamadas(Cliente cliente) {
		double c = 0;
		for (Llamada l : cliente.llamadas) {
			double auxc = 0;
			if (l.getTipoDeLlamada() == "nacional") {
				// el precio es de 3 pesos por segundo más IVA sin adicional por establecer la llamada
				auxc += l.getDuracion() * 3 + (l.getDuracion() * 3 * 0.21);
			} else if (l.getTipoDeLlamada() == "internacional") {
				// el precio es de 150 pesos por segundo más IVA más 50 pesos por establecer la llamada
				auxc += l.getDuracion() * 150 + (l.getDuracion() * 150 * 0.21) + 50;
			}

			if (cliente.getTipo() == "fisica") {
				auxc -= auxc*descuentoFis;
			} else if(cliente.getTipo() == "juridica") {
				auxc -= auxc*descuentoJur;
			}
			c += auxc;
		}
		return c;
	}

	public int cantidadDeUsuarios() {
		return clientes.size();
	}

	public boolean existeUsuario(Cliente persona) {
		return clientes.contains(persona);
	}

	public GestorNumerosDisponibles getGestorNumeros() {
		return this.guia;
	}
}
