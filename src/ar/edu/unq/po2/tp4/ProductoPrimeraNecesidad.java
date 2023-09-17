package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto{
	private double descuento;
	
	ProductoPrimeraNecesidad(String nombre, double precio, double descuento) {
		super(nombre, precio * descuento);
	}
	
	ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado, double descuento) {
		super(nombre, precio * descuento, esPrecioCuidado);
	}

	public double getDescuento() {
		return descuento;
	}
	
}
