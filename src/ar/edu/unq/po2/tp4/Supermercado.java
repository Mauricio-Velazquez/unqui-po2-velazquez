package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	private String nombre;
	private String direccion;
	private List<Producto> productos;
	
	Supermercado(String nombre, String direccion){
		this.nombre = nombre;
		this.direccion = direccion;
		productos = new ArrayList<Producto>();
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public int getCantidadDeProductos() {
		return productos.size();
	}
	
	public void agregarProducto(Producto producto){
		productos.add(producto);
	}
	
	public double getPrecioTotal() {
		double total = 0;
		for (Producto producto : productos) {
			total = total + producto.getPrecio();
		}
		return total;
	}
}
