package ar.edu.unq.po2.tp4;

public class Ingreso {
	private String mesDePercepcion;
	private String concepto;
	private double montoPercibido;

	Ingreso(String mesDePercepcion, String concepto, double montoPercibido) {
		this.mesDePercepcion = mesDePercepcion;
		this.concepto = concepto;
		this.montoPercibido = montoPercibido;
	}

	public String getMesDePercepcion() {
		return mesDePercepcion;
	}

	public String getConcepto() {
		return concepto;
	}
	
	public double getMontoPercibido() {
		return montoPercibido;
	}

	public double getMontoImponible() {
		return montoPercibido;
	}

	public double montoAPagarDeImpuesto() {
		return montoPercibido * 0.02;
	}
	
}
