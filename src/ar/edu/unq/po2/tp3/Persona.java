package ar.edu.unq.po2.tp3;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	private String nombre;
	private LocalDate fechaDeNacimiento;
	private String apellido;
	private int edad;
	
	public Persona(String nombre, LocalDate fechaDeNacimiento) {
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}
			
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
		
	public String getApellido() {
		return apellido;
	}
	
	public int getEdad() {
		return edad;
	}
	
    public int getEdadConFechaDeNacimiento() {
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaDeNacimiento, fechaActual);
        return periodo.getYears();
    }
    
    public boolean menorQue(Persona persona) {
        return this.getEdadConFechaDeNacimiento() < persona.getEdadConFechaDeNacimiento();
    }
	
}
