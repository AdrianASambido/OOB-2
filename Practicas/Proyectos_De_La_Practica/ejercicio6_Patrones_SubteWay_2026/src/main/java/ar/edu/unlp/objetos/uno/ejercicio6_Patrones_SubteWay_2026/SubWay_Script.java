package ar.edu.unlp.objetos.uno.ejercicio6_Patrones_SubteWay_2026;

public class SubWay_Script {

	public static void main(String[] args) {

		SandwichSinTacc sinTacc;
		SandwichVegano vegano;
		SandwichVegetariano vegetariano; 
		SubteWay subteWay;
		
		subteWay   = new SubteWay();
		sinTacc    = new SandwichSinTacc();
		vegano     = new SandwichVegano();
		vegetariano= new SandwichVegetariano();
		
		System.out.println("El valor del sandwich clasico es de : " + "  " + subteWay.construirSandwich().calcularPrecioTotal());	
		
		subteWay.setBuilderSandwich(sinTacc);
		System.out.println("El valor del sandwich sinTacc es de : " + "  " + subteWay.construirSandwich().calcularPrecioTotal());
		
		subteWay.setBuilderSandwich(vegano);
		System.out.println("El valor del sandwich vegano es de : " + "  " + subteWay.construirSandwich().calcularPrecioTotal());
		
		subteWay.setBuilderSandwich(vegetariano);
		System.out.println("El valor del sandwich vegetariano es de : " + "  " + subteWay.construirSandwich().calcularPrecioTotal());
		
	}

}
