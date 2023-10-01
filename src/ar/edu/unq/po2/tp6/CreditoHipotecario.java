package ar.edu.unq.po2.tp6;

public class CreditoHipotecario extends Credito {

	CreditoHipotecario(Cliente clienteQueSolicita, double montoSolicitado, int plazoEnMeses) {
		super(clienteQueSolicita, montoSolicitado, plazoEnMeses);
	}

	@Override
	public boolean esAceptable(Cliente cliente) {
		boolean aceptado = false;
		if((this.montoDeLaCuotaMensual() < (cliente.getSueldoNetoMensual() * 0.50)) & (this.getMontoSolicitado() < (cliente.getPropiedad().getValorFiscal() * 0.70)) & (cliente.getEdad() < 65)) {
			aceptado = true;
		}
		return aceptado;
	}

}
