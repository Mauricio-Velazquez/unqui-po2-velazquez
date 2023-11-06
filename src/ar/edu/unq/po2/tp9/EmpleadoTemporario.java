package ar.edu.unq.po2.tp9;

public class EmpleadoTemporario extends Empleado {
	private int horasTrabajadas;
	private boolean tieneHijos;
	private boolean estaCasado;
	
	public EmpleadoTemporario(int horasTrabajadas, boolean tieneHijos, boolean estaCasado) {
		 this.horasTrabajadas = horasTrabajadas;
	     this.tieneHijos = tieneHijos;
	     this.estaCasado = estaCasado;
	}
	 
    @Override
    protected double calcularSueldoBase() {
        return 1000 + (5 * horasTrabajadas);
    }

    @Override
    protected double calcularExtras() {
    	if(tieneHijos || estaCasado) {
    		return 100;
    	}
    	else {
    		return 0;
    	}
    }
	
}
