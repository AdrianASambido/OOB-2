package ar.edu.unlp.objetos.uno.ejercicio6_Patrones_SubteWay_2026;

/* Una cadena de comidas rápidas especializada en sándwiches necesita resolver el cálculo
 *  de precios de éstos. El cálculo es simple: el precio de un sándwich equivale a la suma 
 *  del precio de cada uno de sus componentes; el problema es la dificultad para representar y
 *  crear cada uno de los sándwiches distintos.
 * Existen cuatro sandwiches distintos, pero podrían aparecer nuevos en el futuro.
 * Clásico: consta de pan brioche (100 pesos), aderezo a base de mayonesa (20 pesos), 
 *   principal de carne de ternera(300 pesos) y adicional de tomate (80 pesos).
 * Vegetariano: consta de pan con semillas (120 pesos), sin aderezo, principal de provoleta
 *   grillada (200 pesos) y adicional de berenjenas al escabeche (100 pesos).
 * Vegano: consta de pan integral (100 pesos), aderezo de salsa criolla (20 pesos), principal 
 *   de milanesa de girgolas (500 pesos), sin adicional.
 * Sin TACC: consta de pan de chipá (150 pesos), aderezo de salsa tártara (18 pesos), 
 *   principal de carne de pollo (250 pesos) y adicional de verduras grilladas (200 pesos).
 *  */

public class SubteWay {
	
	private SandwichBuilder builderSandwich;
	
	public SubteWay() {
		this.builderSandwich = new SandwichClasico();
	}

	public SandwichBuilder getBuilderSandwich() {
		return this.builderSandwich;
	}

	public void setBuilderSandwich(SandwichBuilder tipoSandwich) {
		this.builderSandwich = tipoSandwich;
	}
	
	public Sandwich construirSandwich() {
		this.builderSandwich.agregarAderezo();
		this.builderSandwich.agregarExtra();
		this.builderSandwich.agregarPan();
		this.builderSandwich.agregarPrincipal();
		return this.getBuilderSandwich().getSandwich();
	}
	
	

	
	
	
}
