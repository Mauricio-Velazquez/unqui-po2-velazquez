package ar.edu.unq.po2.tp9;

public abstract class Empleado {
	
    public final double calcularSueldo() {
        double sueldo = calcularSueldoBase() + calcularExtras();
        sueldo = sueldo - (sueldo * 0.13); // Descuento del 13% por aportes y obra social
        return sueldo;
    }

    protected abstract double calcularSueldoBase();

    protected abstract double calcularExtras();

    protected double calcularAportes() {
        return 0; // Ejemplo de Método hook para calcular aportes adicionales, en caso de que en el futuro se agregue algo.
    }

    // En el patrón de diseño Template Method, los roles principales son la clase abstracta y sus subclases concretas.
    // El Template Method es calcularSueldo(), los metodos abstractos calcularSueldoBase() y calcularExtras() son operaciones primitivas,
    // en este caso no hay operaciones concretas, y por ultimo calcularAportes es un metodo hook que puede ser sobreescrito por la subclase que lo necesite.
}
