package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	private List<Ingreso> ingresos;
	
	Trabajador(){
		ingresos = new ArrayList<Ingreso>();
	}
	
	public void agregarIngreso(Ingreso ingreso){
		ingresos.add(ingreso);
	}
	
	public double getTotalPercibido(){
		double total = 0;
		for (Ingreso ingreso : ingresos) {
			total = total + ingreso.getMontoPercibido();
		}
		return total;
	}
	
	public double getMontoImponible() {
		double total = 0;
		for (Ingreso ingreso : ingresos) {
			total = total + ingreso.getMontoImponible();
		}
		return total;
	}
	
	public double getImpuestoAPagar() {
		double total = 0;
		for (Ingreso ingreso : ingresos) {
			total = total + ingreso.montoAPagarDeImpuesto();
		}
		return total;
	}
	
}

