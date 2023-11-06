package ar.edu.unq.po2.tp8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CartaTestCase {
	private Carta carta1;
	private Carta carta2;
	private Carta carta3;
	private Carta carta4;
	private Carta carta5;
	private Carta carta6;
	private Carta carta7;
	private Carta carta8;
	private Carta carta9;
	private Carta carta10;
	private Carta carta11;
	private Carta carta12;
	private Carta carta13;
	private Carta carta14;
	private PokerStatus poker;

	//Setup
	@BeforeEach
	void setUp() throws Exception {
		carta1 = new Carta("1", "P");
		carta2 = new Carta("1", "C");
		carta3 = new Carta("1", "D");
		carta4 = new Carta("1", "T");
		carta5 = new Carta("2", "P");
		carta6 = new Carta("Q", "D");
		carta7 = new Carta("10", "D");
		carta8 = new Carta("2", "D");
		carta9 = new Carta("3", "D");
		carta10 = new Carta("4", "D");
		carta11 = new Carta("5", "D");
		carta12 = new Carta("10", "P");
		carta13 = new Carta("10", "C");
		carta14 = new Carta("10", "T");
		poker = new PokerStatus();
	}
	
	//Exercise
	@Test
	void testVerificarSiEsPoker1() {
		//Verify
		System.out.println(poker.verificar2(carta1, carta2, carta3, carta4, carta5) + " test1");
	}
		
	@Test
	void testVerificarSiEsPoker2() {
		//Verify
		System.out.println(poker.verificar2(carta5, carta1, carta2, carta3, carta4) + " test2");
	}
		
	@Test
	void testVerificarSiEsPoker3() {
		//Verify
		System.out.println(poker.verificar2(carta1, carta2, carta7, carta3, carta4) + " test3");
	}
	
	@Test
	void testVerificarSiEsTrio1() {
		//Verify
		System.out.println(poker.verificar2(carta1, carta2, carta3, carta5, carta6) + " test4");
	}
	
	@Test
	void testVerificarSiEsTrio2() {
		//Verify
		System.out.println(poker.verificar2(carta1, carta2, carta7, carta3, carta6) + " test5");
	}
	
	@Test
	void testVerificarSiEsColor1() {
		//Verify
		System.out.println(poker.verificar2(carta7, carta8, carta9, carta10, carta11) + " test6");
	}
	
	@Test
	void testVerificarSiEsPoker4() {
		//Verify
		System.out.println(poker.verificar2(carta7, carta12, carta13, carta14, carta1) + " test7");
	}
	
	@Test
	void testConMockito() {
		Carta cartaMockito1 = mock(Carta.class);
		Carta cartaMockito2 = mock(Carta.class);
		Carta cartaMockito3 = mock(Carta.class);
		Carta cartaMockito4 = mock(Carta.class);
		Carta cartaMockito5 = mock(Carta.class);
				
	    // Configuración de valores
		when(cartaMockito1.getValor()).thenReturn("1");
		when(cartaMockito1.obtenerValorNumerico("1")).thenReturn(1);
		when(cartaMockito2.getValor()).thenReturn("1");
		when(cartaMockito2.obtenerValorNumerico("1")).thenReturn(1);
		when(cartaMockito3.getValor()).thenReturn("1");
		when(cartaMockito3.obtenerValorNumerico("1")).thenReturn(1);
		when(cartaMockito4.getValor()).thenReturn("1");
		when(cartaMockito4.obtenerValorNumerico("1")).thenReturn(1);
		when(cartaMockito5.getValor()).thenReturn("5");
		
	    // Configuración de palos
	    when(cartaMockito1.getPalo()).thenReturn("P"); // Picas
	    when(cartaMockito2.getPalo()).thenReturn("C"); // Corazones
	    when(cartaMockito3.getPalo()).thenReturn("D"); // Diamantes
	    when(cartaMockito4.getPalo()).thenReturn("T"); // Tréboles
	    when(cartaMockito5.getPalo()).thenReturn("C"); // Corazones
		
		String resultado = poker.verificar2(cartaMockito1, cartaMockito2, cartaMockito3, cartaMockito4, cartaMockito5);
		
		assertEquals("Poker", resultado);			
		
		// Verificar el orden
		InOrder inOrder = inOrder(cartaMockito1);
		inOrder.verify(cartaMockito1).getValor();
		inOrder.verify(cartaMockito1).obtenerValorNumerico("1");
	}
	
/*
	// Crear objetos mock
	PadreMock padreMock = mock(PadreMock.class);
	HijoMock hijoMock = mock(HijoMock.class);
		
	// Configurar el comportamiento
	when(padreMock.getHijo()).thenReturn(hijoMock);
	when(hijoMock.getValor()).thenReturn("Valor esperado");

	// Verificar el comportamiento anidado
	assertEquals("Valor esperado", padreMock.getHijo().getValor());

*/
	
	//La forma de verificación más común en Mockito es usar métodos como verify()
	
	//Teardown
	//Java se encarga automáticamente del teardown, por lo que no es necesario un método explícito para este propósito.

}
