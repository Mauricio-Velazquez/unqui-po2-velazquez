package ar.edu.unq.po2.tp6;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private String nombre;
	private List<Cliente> clientes;
	private List<Credito> creditos;
	
	public Banco(String nombre) {
		this.nombre = nombre;
		clientes = new ArrayList<Cliente>();
		creditos = new ArrayList<Credito>();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void agregarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public int getTotalDeClientes() {
		return clientes.size();
	}
	
	public void agregarCreditoSiEsAceptado(Credito credito) {
		if(credito.esAceptable(credito.getClienteQueSolicita())) {
			creditos.add(credito);
			credito.getClienteQueSolicita().setMontoDelCredito(credito.getMontoSolicitado());
		}
	}
	
	public double calcularMontoTotalADesembolsar() {
		return creditos.stream().mapToDouble(credito -> credito.getMontoSolicitado()).sum();
	}
}
