package ar.edu.unq.po2.tp10;

import java.util.List;
import java.util.ArrayList;

public class Ejercito implements Movimiento{
	private List<Movimiento> movimientos;
	
	Ejercito(){
		movimientos = new ArrayList<Movimiento>(); 
	}
	
	public void agregarMovimiento(Movimiento movimiento) {
        movimientos.add(movimiento);
    }

	public int cantidadDeMovimientos(){
		return movimientos.size();
	}
	
	public void caminar() {
		for (Movimiento movimiento : movimientos) {
			movimiento.caminar();
		}
	}
	
	// La interfaz Movimiento es el componente, las clases Ingeniero y Caballero son las hojas (objetos individuales), Ejercito es el objeto compuesto.
	
	// El termino componente se refiere a la interfaz o clase abstracta que define el comportamiento comun entre las hojas y los objetos compuestos.
}
