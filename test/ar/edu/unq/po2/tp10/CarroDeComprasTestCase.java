package ar.edu.unq.po2.tp10;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarroDeComprasTestCase {
	private CarroDeCompras carroDeCompras;
	private Producto producto1;
	private ProductoEspecial producto2;
	private List<Producto> productos;

	//Setup
	@BeforeEach
	void setUp() throws Exception {
		producto1 = new Producto("Azucar", 333.33f);
		producto2 = new ProductoEspecial("Yerba", 250.00f);
		carroDeCompras = new CarroDeCompras();
		productos = new ArrayList<Producto>();
		productos.add(producto1);
		productos.add(producto2);
		carroDeCompras.setProductos(productos);
	}
	
	//Exercise
	@Test
	void testTotalDeLosProductosSinRedondear() {
		//Verify
		assertEquals(carroDeCompras.total(), 583.3299560546875);
	}
	
	@Test
	void testTotalDeLosProductosConRedondeo() {
		//Verify
		assertEquals(carroDeCompras.totalRounded(), 583);
	}
}
