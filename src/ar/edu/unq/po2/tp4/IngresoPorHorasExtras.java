package ar.edu.unq.po2.tp4;

public class IngresoPorHorasExtras extends Ingreso{
	private int cantidadDeHorasExtras;
	
	IngresoPorHorasExtras(String mesDePercepcion, String concepto, double montoPercibido, int cantidadDeHorasExtras) {
		super(mesDePercepcion, concepto, montoPercibido);
		this.cantidadDeHorasExtras = cantidadDeHorasExtras;
	}
	
	public double getcantidadDeHorasExtras() {
		return cantidadDeHorasExtras;
	}
	
	@Override
	public double getMontoImponible() {
		return 0;
	}
	
	@Override
	public double montoAPagarDeImpuesto() {
		return 0;
	}

}
