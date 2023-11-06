package ar.edu.unq.po2.tp9;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoTestCase {
	private EmpleadoTemporario empleado1;
	private EmpleadoPasante empleado2;
	private EmpleadoDePlanta empleado3;

	//Setup
	@BeforeEach
	void setUp() throws Exception {
		empleado1 = new EmpleadoTemporario(10, true, true);
		empleado2 = new EmpleadoPasante(25);
		empleado3 = new EmpleadoDePlanta(3);
	}
	
	//Exercise
	@Test
	void testVerificarSueldoDeEmpleadoTemporario() {
		//Verify
		assertEquals(empleado1.calcularSueldo(), 1000.5);
	}
	
	@Test
	void testVerificarSueldoDeEmpleadoPasante() {
		//Verify
		assertEquals(empleado2.calcularSueldo(), 870);
	}
	
	@Test
	void testVerificarSueldoDeEmpleadoDePlanta() {
		//Verify
		assertEquals(empleado3.calcularSueldo(), 3001.5);
	}

}
