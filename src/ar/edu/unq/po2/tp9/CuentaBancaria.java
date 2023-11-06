package ar.edu.unq.po2.tp9;

import java.util.ArrayList;
import java.util.List;

public abstract class CuentaBancaria { // Clase abstracta
	private String titular;
	private int saldo;
	private List<String> movimientos;
	
	public CuentaBancaria(String titular){
		this.titular = titular;
		this.saldo = 0;
		this.movimientos = new ArrayList<String>();
	}
	
	public String getTitular(){ // Operacion concreta
		return this.titular;
	}
	
	public int getSaldo(){ // Operacion concreta
		return this.saldo;
	}
	
	protected void setSaldo(int monto){ // Operacion concreta
		this.saldo = monto;
	}
	 
	public void agregarMovimientos(String movimiento){ // Operacion concreta
		this.movimientos.add(movimiento);
	}
	 	 
	public final void extraer(int monto) { //Template method
		if(this.condicionDeExtraccionConMonto(monto)){
			this.setSaldo(this.getSaldo() - monto);
			this.agregarMovimientos("Extraccion");
		}
	}
	 
	public abstract boolean condicionDeExtraccionConMonto(int monto); // Operacion primitiva
	
	// No hay hook method
	 
}




