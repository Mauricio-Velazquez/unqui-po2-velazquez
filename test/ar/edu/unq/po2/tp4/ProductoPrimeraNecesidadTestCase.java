package ar.edu.unq.po2.tp4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTestCase {

	private ProductoPrimeraNecesidad leche;
	private ProductoPrimeraNecesidad arroz;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false, 0.9);
		arroz = new ProductoPrimeraNecesidad("Arroz", 12d, false, 0.9);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(Double.valueOf(7.2), leche.getPrecio());
		assertEquals(Double.valueOf(10.8), arroz.getPrecio());
	}
}