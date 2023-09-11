package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RectanguloTestCase {
	private Rectangulo rectangulo;
	
	@BeforeEach
	public void setUp() throws Exception {
        Punto puntoSuperiorIzquierdo1 = new Punto(1, 4);
        Punto puntoInferiorDerecho1 = new Punto(5, 1);
        
        rectangulo = new Rectangulo(puntoSuperiorIzquierdo1, puntoInferiorDerecho1);
    }
	
	@Test
	public void testAreaDelRectangulo() {
		int area = rectangulo.obtenerArea();
		assertEquals(area, 12);
	}
	
	@Test
	public void testPerimetroDelRectangulo() {
		int perimetro = rectangulo.obtenerPerimetro();
		assertEquals(perimetro, 14);
	}
	
	@Test
	public void testRectanguloEsHorizontal() {
		assertTrue(rectangulo.esHorizontal());
	}
	
	@Test
	public void testRectanguloEsVertical() {
		assertFalse(rectangulo.esVertical());
	}
    
}
