package ar.edu.unlp.objetos.uno.ejercicio4_Patrones_Topografia_2026;

import java.util.ArrayList;
import java.util.List;

public class Mixta implements Topografia{

	private List<Topografia> topografias;
	
	public Mixta() { 
		this.topografias = new ArrayList<>();
	}

	@Override
	public double calcularProporcionDeAgua() {
		return this.topografias.stream().mapToDouble(topografia->topografia.calcularProporcionDeAgua()).sum()/4;
	}

	@Override
	public boolean soyIgualAMixta(Mixta unaMixta) {
		return this.topografias.equals(unaMixta.topografias);
	}
	@Override
	public boolean equals(Object o){
		return ((Topografia)o).soyIgualAMixta(this);
	}
	
	public void agregarTopografia(Topografia unaTopografia) {
		if(this.topografias.size() < 4){
			this.topografias.add(unaTopografia);
		}
	}
}
