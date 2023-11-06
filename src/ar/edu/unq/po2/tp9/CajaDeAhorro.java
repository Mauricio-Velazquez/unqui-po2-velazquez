package ar.edu.unq.po2.tp9;

public class CajaDeAhorro extends CuentaBancaria { // Clase concreta
	private int limite;
	 
	public CajaDeAhorro(String titular, int limite){
		super(titular);
		this.limite = limite;
	}
	 
	public int getLimite(){
		return this.limite;
	}
	 	
	@Override
	public boolean condicionDeExtraccionConMonto(int monto) {
		return this.getSaldo() >= monto && this.getLimite() >= monto;
	}
}
