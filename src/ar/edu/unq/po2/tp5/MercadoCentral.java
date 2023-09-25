package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class MercadoCentral {
    private List<Caja> cajas;

    public MercadoCentral() {
        cajas = new ArrayList<Caja>();
    }

    public void agregarCaja(Caja caja) {
        cajas.add(caja);
    }
    
	public double getTotalDeLasCajas(){
		double total = 0;
		for (Caja caja : cajas) {
			total = total + caja.calcularTotal();
		}
		return total;
	}
    
}