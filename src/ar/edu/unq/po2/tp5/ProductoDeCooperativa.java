package ar.edu.unq.po2.tp5;

public class ProductoDeCooperativa extends Producto {

	public ProductoDeCooperativa(String nombre, double precio, int stock) {
		super(nombre, precio * 0.9 , stock);
	}

}
