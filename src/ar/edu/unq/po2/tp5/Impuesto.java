package ar.edu.unq.po2.tp5;

public class Impuesto extends Factura {
	private String nombre;
	private double valorFijo;
	
	Impuesto(String nombre, double valorFijo){
		this.nombre = nombre;
		this.valorFijo = valorFijo;
	}

	public String getNombre() {
		return nombre;
	}

	public double montoAPagar() {
		return valorFijo;
	}

	public void notificarPago() {
		System.out.println("Pago registrado para la factura: " + this.getNombre() + " por un monto de $" + this.montoAPagar());
	}
	
}
