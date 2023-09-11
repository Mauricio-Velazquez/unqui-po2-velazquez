package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CuadradoTestCase {
	private Cuadrado cuadrado;
	
	@BeforeEach
	public void setUp() throws Exception {
        cuadrado = new Cuadrado(new Punto(2, 5), 5);
    }
	
	@Test
	public void testAreaDelCuadrado() {
		int area = cuadrado.obtenerArea();
		assertEquals(area, 25);
	}
	
	@Test
	public void testPerimetroDelCuadrado() {
		int perimetro = cuadrado.obtenerPerimetro();
		assertEquals(perimetro, 20);
	}
	
	@Test
	public void testCuadradoEsHorizontal() {
		assertFalse(cuadrado.esHorizontal());
	}
	
	@Test
	public void testCuadradoEsVertical() {
		assertFalse(cuadrado.esVertical());
	}
    
}
