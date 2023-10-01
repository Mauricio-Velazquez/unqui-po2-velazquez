package ar.edu.unq.po2.tp6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BancoTestCase {
	private Cliente cliente1;
	private Cliente cliente2;
	private Propiedad propiedad1;
	private Propiedad propiedad2;
	private Banco bancoSantander;
	private Credito creditoPersonal;
	private Credito creditoHipotecario;

	@BeforeEach
	public void setUp() {
		propiedad1 = new Propiedad("Casa", "Av Corriente", 5000000);
		propiedad2 = new Propiedad("Casa", "Puerto Madero", 6500000);	
		cliente1 = new Cliente("Nestor", "Deangelo", "Calle 123", 43, 120000, propiedad1);
		cliente2 = new Cliente("Rodolfo", "Nuñez", "Calle 179", 55, 170000, propiedad2);
		bancoSantander = new Banco("Santander Rio");
		creditoPersonal = new CreditoPersonal(cliente1, 300000, 6);
		creditoHipotecario = new CreditoHipotecario(cliente2, 150000, 2);
		bancoSantander.agregarCliente(cliente1);
		bancoSantander.agregarCliente(cliente2);
	}
	
	@Test
	public void testTotalDeClientes() {
		assertEquals(2, bancoSantander.getTotalDeClientes());
	}
	
	@Test
	public void testCreditoAceptado() {
		cliente1.solicitarCreditoA(creditoPersonal, bancoSantander);
		assertEquals(cliente1.getMontoDelCredito(), 300000);
	}
	
	@Test
	public void testTotalDeTodosLosCreditos() {
		cliente1.solicitarCreditoA(creditoPersonal, bancoSantander);
		cliente2.solicitarCreditoA(creditoHipotecario, bancoSantander);
		assertEquals(bancoSantander.calcularMontoTotalADesembolsar(), 450000);
	}
	
}
