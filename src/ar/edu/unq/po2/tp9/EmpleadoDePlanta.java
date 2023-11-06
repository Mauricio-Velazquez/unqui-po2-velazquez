package ar.edu.unq.po2.tp9;

public class EmpleadoDePlanta extends Empleado {
	private int cantidadDeHijos;
	
	public EmpleadoDePlanta(int cantidadDeHijos) {
        this.cantidadDeHijos = cantidadDeHijos;
    }

    @Override
    protected double calcularSueldoBase() {
        return 3000;
    }

    @Override
    protected double calcularExtras() {
        return 150 * cantidadDeHijos;
    }
}
