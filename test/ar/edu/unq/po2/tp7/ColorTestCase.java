package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ColorTestCase {

	@Test
	void testSiguienteColor() {
		assertEquals(Color.ROJO.getSiguienteColor(), "Gris");
	}

}
