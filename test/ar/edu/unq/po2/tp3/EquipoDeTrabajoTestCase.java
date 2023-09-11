package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipoDeTrabajoTestCase {
	private EquipoDeTrabajo equipo1;

	@BeforeEach
	public void setUp() throws Exception {
		equipo1 = new EquipoDeTrabajo("Marketing");
		Persona juan = new Persona("Juan", "Valdez", 25);
		Persona roberto = new Persona("Roberto", "Fernandez", 40);
		Persona nestor = new Persona("Nestor", "Zapata", 32);
		Persona natalia = new Persona("Natalia", "Galindez", 27);
		Persona julieta = new Persona("Julieta", "Alvarez", 35);
		
		equipo1.agregarIntegrante(juan);
		equipo1.agregarIntegrante(roberto);
		equipo1.agregarIntegrante(nestor);
		equipo1.agregarIntegrante(natalia);
		equipo1.agregarIntegrante(julieta);
	}
	
	@Test
	public void testPromedioEdad() {
		int promedioEsperado = equipo1.promedioDeEdad();
		System.out.println("El promedio de edad de los integrantes del equipo es: " + promedioEsperado);
		assertEquals(promedioEsperado, 31);
	}

}
