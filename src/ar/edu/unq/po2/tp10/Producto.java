package ar.edu.unq.po2.tp10;

public class Producto {
	private String nombre;
	private float precio;
	
	Producto(String nombre, float precio){
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public float getPrecio() {
		return precio;
	}
	
}
