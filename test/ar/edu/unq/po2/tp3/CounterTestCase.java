package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CounterTestCase {
	private Counter counter;
	/**
	* Crea un escenario de test básico, que consiste en un contador
	* con 10 enteros
	*
	* @throws Exception
	*/
	@BeforeEach
	public void setUp() throws Exception {
	//Se crea el contador
	counter = new Counter();
	//Se agregan los numeros. Un solo par y nueve impares.
	counter.addNumber(1);
	counter.addNumber(3);
	counter.addNumber(5);
	counter.addNumber(7);
	counter.addNumber(9);
	counter.addNumber(1);
	counter.addNumber(1);
	counter.addNumber(1);
	counter.addNumber(1);
	counter.addNumber(4);
	counter.addNumber(18);
}
	
//Verifica la cantidad de pares
@Test
public void testNumerosPares() {
	// Obtengo la cantidad de numeros pares con la función contarPares()
	int amount = counter.contarPares();
	// Compruebo que el monto es el esperado.
	assertEquals(amount, 2);
	}


//Verifica la cantidad de impares
@Test
public void testNumerosImpares() {
	// Obtengo la cantidad de numeros impares con la función contarImpares()
	int amount = counter.contarImpares();
	// Compruebo que el monto es el esperado.
	assertEquals(amount, 9);
	}

//Verifica la cantidad de múltiplos que tiene un numero en un array
@Test
public void testNumerosMultiplos() {
	// Obtengo la cantidad de multiplos de un cierto numero con la función contarMultiplosDe(int numero)
	int amount = counter.contarMultiplosDe(9);
	// Compruebo que el monto es el esperado.
	assertEquals(amount, 2);
	}

}




