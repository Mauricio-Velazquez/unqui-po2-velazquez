package ar.edu.unq.po2.tp5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MercadoCentralTestCase {
	private Caja caja1;
	private Caja caja2;
	private Producto arroz;
	private ProductoDeCooperativa leche;
	private Producto aceite;
	private MercadoCentral mercadoCentral;
	private Servicio movistar;
	private Impuesto propiedad;
	
	@BeforeEach
	public void setUp() {
		caja1 = new Caja();
		caja2 = new Caja();
		arroz = new Producto("Arroz", 18, 5);
		leche = new ProductoDeCooperativa("Leche", 25 , 2);
		aceite = new Producto("Aceite", 40, 0);
		movistar = new Servicio("Movistar", 5, 10, "Abril");
		propiedad = new Impuesto("Impuesto a la propiedad", 2000);
		mercadoCentral = new MercadoCentral();
		caja1.agregarFactura(arroz);
		caja1.agregarFactura(leche);
		caja2.agregarFactura(aceite);
		caja1.agregarFactura(movistar);
		caja2.agregarFactura(propiedad);
	}
	
	@Test
	public void testTotalDeLasCajas() {
		assertEquals(0, mercadoCentral.getTotalDeLasCajas());
		mercadoCentral.agregarCaja(caja1);
		mercadoCentral.agregarCaja(caja2);
		assertEquals(2090.5, mercadoCentral.getTotalDeLasCajas());
		caja1.registrarPago(movistar);
		caja2.registrarPago(propiedad);
	}
}
