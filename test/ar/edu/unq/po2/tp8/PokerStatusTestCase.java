package ar.edu.unq.po2.tp8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PokerStatusTestCase {
	private String carta1;
	private String carta2;
	private String carta3;
	private String carta4;
	private String carta5;
	private String carta6;
	private String carta7;
	private String carta8;
	private String carta9;
	private String carta10;
	private String carta11;
	private String carta12;
	private String carta13;
	private String carta14;
	private PokerStatus poker;

	//Setup
	@BeforeEach
	void setUp() throws Exception {
		carta1 = "1P";
		carta2 = "1C";
		carta3 = "1D";
		carta4 = "1T";
		carta5 = "2P";
		carta6 = "QD";
		carta7 = "10D";
		carta8 = "2D";
		carta9 = "3D";
		carta10 = "4D";
		carta11 = "5D";
		carta12 = "10P";
		carta13 = "10C";
		carta14 = "10T";
		poker = new PokerStatus();
	}
	
	//Exercise
	@Test
	void testVerificarSiEsPoker1() {
		//Verify
		System.out.println(poker.verificar(carta1, carta2, carta3, carta4, carta5) + " test1");
	}
		
	@Test
	void testVerificarSiEsPoker2() {
		//Verify
		System.out.println(poker.verificar(carta5, carta1, carta2, carta3, carta4) + " test2");
	}
		
	@Test
	void testVerificarSiEsPoker3() {
		//Verify
		System.out.println(poker.verificar(carta1, carta2, carta7, carta3, carta4) + " test3");
	}
	
	@Test
	void testVerificarSiEsTrio1() {
		//Verify
		System.out.println(poker.verificar(carta1, carta2, carta3, carta5, carta6) + " test4");
	}
	
	@Test
	void testVerificarSiEsTrio2() {
		//Verify
		System.out.println(poker.verificar(carta1, carta2, carta7, carta3, carta6) + " test5");
	}
	
	@Test
	void testVerificarSiEsColor1() {
		//Verify
		System.out.println(poker.verificar(carta7, carta8, carta9, carta10, carta11) + " test6");
	}
	
	@Test
	void testVerificarSiEsPoker4() {
		//Verify
		System.out.println(poker.verificar(carta7, carta12, carta13, carta14, carta1) + " test7");
	}
	
	//Teardown
	//Java se encarga automáticamente del teardown, por lo que no es necesario un método explícito para este propósito.

}
