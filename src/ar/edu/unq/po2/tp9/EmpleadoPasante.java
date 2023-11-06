package ar.edu.unq.po2.tp9;

public class EmpleadoPasante extends Empleado {
	private int horasTrabajadas;
	
    public EmpleadoPasante(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    
    @Override
    protected double calcularSueldoBase() {
        return 40 * horasTrabajadas;
    }

    @Override
    protected double calcularExtras() {
        return 0;
    }
}
