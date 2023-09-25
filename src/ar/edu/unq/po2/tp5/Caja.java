package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Caja implements Agencia{
    private List<Factura> carrito;

    public Caja() {
        carrito = new ArrayList<Factura>();
    }

    public void agregarFactura(Factura factura) {
        carrito.add(factura);
    }

    public double calcularTotal() {
    	double total = 0;
        for (Factura factura : carrito) {
        	total = total + factura.montoAPagar();
        }
        return total;
    }
    
	public void registrarPago(Factura factura) {
		factura.notificarPago();
	}

}