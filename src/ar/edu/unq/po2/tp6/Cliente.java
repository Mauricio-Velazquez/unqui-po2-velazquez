package ar.edu.unq.po2.tp6;

public class Cliente {
	private String nombre;
	private String apellido;
	private String direccion;
	private int edad;
	private double sueldoNetoMensual;
	private double sueldoNetoAnual;
	private Propiedad propiedad;
	private double montoDelCredito;
	
	Cliente(String nombre, String apellido, String direccion, int edad, double sueldoNetoMensual, Propiedad propiedad){
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.sueldoNetoMensual = sueldoNetoMensual;
		this.propiedad = propiedad;
		sueldoNetoAnual = this.sueldoNetoMensual * 12;
		montoDelCredito = 0;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public double getSueldoNetoMensual() {
		return sueldoNetoMensual;
	}
	
	public double getSueldoNetoAnual() {
		return sueldoNetoAnual;
	}
	
	public Propiedad getPropiedad() {
		return propiedad;
	}
	
	public void solicitarCreditoA(Credito credito, Banco banco) {
		banco.agregarCreditoSiEsAceptado(credito);
	}
	
	public void setMontoDelCredito(double monto) {
		montoDelCredito = monto;
	}
	
	public double getMontoDelCredito() {
		return montoDelCredito;
	}
}
