package ar.edu.unq.po2.tp10;

import java.util.ArrayList;
import java.util.List;

public class CarroDeCompras {
	private List<Producto> productos;
	
	CarroDeCompras(){
		productos = new ArrayList<Producto>();
    }

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	public int totalRounded() {
		return productos.stream().mapToInt(p -> (int) p.getPrecio()).sum();
	}
	
	public float total() {
		return (float) productos.stream().mapToDouble(p -> p.getPrecio()).sum();
	}
	
}
