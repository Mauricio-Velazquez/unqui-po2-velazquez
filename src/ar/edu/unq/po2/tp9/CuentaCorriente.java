package ar.edu.unq.po2.tp9;

public class CuentaCorriente extends CuentaBancaria { // Clase concreta
	private int descubierto;
	 
	public CuentaCorriente(String titular, int descubierto){
		super(titular);
		this.descubierto = descubierto;
	}
	
	public int getDescubierto(){
		return this.descubierto;
	}
	 	
	@Override
	public boolean condicionDeExtraccionConMonto(int monto) {
		return this.getSaldo() + this.getDescubierto() >= monto;
	}
}
