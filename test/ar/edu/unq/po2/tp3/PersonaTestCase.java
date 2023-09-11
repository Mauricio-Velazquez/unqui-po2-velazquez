package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonaTestCase {
	private Persona juan;
	private Persona roberto;
	
	@BeforeEach
	public void setUp() throws Exception {
		juan = new Persona("Juan", LocalDate.of(1990, 5, 15));
		roberto = new Persona("Roberto", LocalDate.of(1970, 3, 22));
    }
	
	@Test
	public void testCalcularEdad() {
		int edadEsperada = juan.getEdadConFechaDeNacimiento();
		assertEquals(edadEsperada, 33);
	}
	
	@Test
	public void testUnaPersonaEsMenorQueOtra() {
		assertTrue(juan.menorQue(roberto));
	}
}
