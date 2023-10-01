package ar.edu.unq.po2.tp6;

public class CreditoPersonal extends Credito {

	CreditoPersonal(Cliente clienteQueSolicita, double montoSolicitado, int plazoEnMeses) {
		super(clienteQueSolicita, montoSolicitado, plazoEnMeses);
	}

	@Override
	public boolean esAceptable(Cliente cliente) {
		boolean aceptado = false;
		if((cliente.getSueldoNetoAnual() >= 15000) & this.montoDeLaCuotaMensual() < (cliente.getSueldoNetoMensual() * 0.70)) {
			aceptado = true;
		}
		return aceptado;
	}

}
