package ar.edu.unq.po2.tp6;

public abstract class Credito {
	private Cliente clienteQueSolicita;
	private double montoSolicitado;
	private int plazoEnMeses;
	
	Credito(Cliente clienteQueSolicita, double montoSolicitado, int plazoEnMeses){
		this.clienteQueSolicita = clienteQueSolicita;
		this.montoSolicitado = montoSolicitado;
		this.plazoEnMeses = plazoEnMeses;
	}

	public Cliente getClienteQueSolicita() {
		return clienteQueSolicita;
	}

	public double getMontoSolicitado() {
		return montoSolicitado;
	}

	public int getPlazoEnMeses() {
		return plazoEnMeses;
	}
	
	public double montoDeLaCuotaMensual() {
		return montoSolicitado / plazoEnMeses;
	}
	
	public abstract boolean esAceptable(Cliente cliente);
}
