package ar.edu.unq.po2.tp10;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EjercitoTestCase {
	private Ingeniero ingeniero1;
	private Caballero caballero1;
	private Ejercito ejercito1;
	private Ejercito ejercito2;

	//Setup
	@BeforeEach
	void setUp() throws Exception {
		ingeniero1 = new Ingeniero(10);
		caballero1 = new Caballero();
		ejercito1 = new Ejercito();
		ejercito2 = new Ejercito();
		ejercito1.agregarMovimiento(caballero1);
		ejercito1.agregarMovimiento(ingeniero1);
		ejercito1.agregarMovimiento(ejercito2);
	}
	
	//Exercise
	@Test
	void testMoverEjercito() {
		//Verify
		assertEquals(ejercito1.cantidadDeMovimientos(), 3);
	}
}