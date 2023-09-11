package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MultiOperadorTestCase {
	private MultiOperador multiOperador;
	
	@BeforeEach
	public void setUp() throws Exception {
	multiOperador = new MultiOperador();
	multiOperador.agregarNumero(1);
	multiOperador.agregarNumero(2);
	multiOperador.agregarNumero(3);
	multiOperador.agregarNumero(4);
	multiOperador.agregarNumero(5);
	multiOperador.agregarNumero(6);
	multiOperador.agregarNumero(7);	
	multiOperador.agregarNumero(8);
	multiOperador.agregarNumero(9);
	multiOperador.agregarNumero(10);
	multiOperador.agregarNumero(15);
	}
	
@Test
public void testSumarNumeros() {
	int resultado = multiOperador.sumarNumeros();
	assertEquals(resultado, 70);
	}

@Test
public void testRestarNumeros() {
	int resultado = multiOperador.restarNumeros();
	assertEquals(resultado, -70);
	}

@Test
public void testMultiplicarNumeros() {
	int resultado = multiOperador.multiplicarNumeros();
	assertEquals(resultado, 54432000);
	}

}
