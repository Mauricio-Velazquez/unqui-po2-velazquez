package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TrabajadorTestCase {

	private Ingreso ingreso1;
	private Ingreso ingreso2;
	private IngresoPorHorasExtras ingreso3;
	private Trabajador trabajador;
	
	@BeforeEach
	public void setUp() {
		ingreso1 = new Ingreso("Marzo", "Salario", 1000);
		ingreso2 = new Ingreso("Abril", "Salario", 1500);
		ingreso3 = new IngresoPorHorasExtras("Mayo", "Salario", 1000, 5);
		trabajador = new Trabajador();
	}
	
	@Test
	public void testTotalPercibido() {
		assertEquals(0, trabajador.getTotalPercibido());
		trabajador.agregarIngreso(ingreso1);
		trabajador.agregarIngreso(ingreso2);
		trabajador.agregarIngreso(ingreso3);
		assertEquals(3500, trabajador.getTotalPercibido());
	}
	
	@Test
	public void testTotalMontoImponible() {
		assertEquals(0, trabajador.getMontoImponible());
		trabajador.agregarIngreso(ingreso1);
		trabajador.agregarIngreso(ingreso2);
		trabajador.agregarIngreso(ingreso3);
		assertEquals(2500, trabajador.getMontoImponible());
	}
	
	@Test
	public void testTotalImpuestoAPagar() {
		assertEquals(0, trabajador.getImpuestoAPagar());
		trabajador.agregarIngreso(ingreso1);
		trabajador.agregarIngreso(ingreso2);
		trabajador.agregarIngreso(ingreso3);
		assertEquals(50, trabajador.getImpuestoAPagar());
	}

}
