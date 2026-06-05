package ar.edu.unlp.objetos.uno.ejercicio9_Refactoring_Pedidos_2026;

public class Pago_6_Cuotas extends FormaDePago{

	@Override
	public double pagoExtra(double costo) {
		return costo * 0.2;
	}

}
