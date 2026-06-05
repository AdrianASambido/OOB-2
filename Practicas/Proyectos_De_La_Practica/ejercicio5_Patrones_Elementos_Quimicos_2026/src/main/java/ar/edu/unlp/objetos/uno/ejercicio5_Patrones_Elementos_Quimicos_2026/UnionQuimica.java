package ar.edu.unlp.objetos.uno.ejercicio5_Patrones_Elementos_Quimicos_2026;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/* Una unión es estable (se denomina molécula) cuando la suma de las cargas de todos sus 
 * componentes es igual a 0. La carga total de una sustancia es la suma de las cargas de
 * sus componentes. Si la carga total no es cero, la unión se denomina ion.*/

public class UnionQuimica extends ElementoQuimico{
	
	private List<ElementoQuimico> elmentQuim; //tiene muchos elementos Quimicos
	
	public UnionQuimica(){
		this.elmentQuim = new ArrayList <>();
	}

	public void calcularCargaElectrica() {
		int carga = this.elmentQuim.stream().mapToInt(e->e.getCargaElectrica()).sum();
		this.setCargaElectrica(carga);
	}
	
	public void add(ElementoQuimico e) {
		this.elmentQuim.add(e);
	}
	
	public String formula() {
		String r = this.elmentQuim.stream().map(e->e.formula()).collect(Collectors.joining());
		return r;
	}
	
	public int pesoMolecular() {
		int peso = this.elmentQuim.stream().mapToInt(p->p.getPesoAtomico()).sum();
		return peso;
		
	}
	/*Una unión es estable (se denomina molécula) cuando la suma
	 *  de las cargas de todos sus componentes es igual a 0.*/
	public boolean esIon() { // puede quedar 1
		boolean ok = false;
		if(this.elmentQuim.stream().mapToInt(c->c.getCargaElectrica()).sum()==0) {
			ok = true;
		}
		return ok;
	}
	
		/*está recibiendo dos parametros*/
	public boolean esValida(ElementoQuimico primerElemento, ElementoQuimico segundoElemento) {
		boolean ok = false;
		if(primerElemento.isEsMetal() != segundoElemento.isEsMetal()) {
			ok = true;
		}
		return ok;
	}
	
}
