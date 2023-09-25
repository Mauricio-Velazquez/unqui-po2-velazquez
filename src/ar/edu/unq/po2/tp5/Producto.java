package ar.edu.unq.po2.tp5;

public class Producto extends Factura{
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void reducirStock() {
        stock = stock - 1;
    }

	public double montoAPagar() {
		double monto = 0;
    	if(this.getStock() >= 1) {
    		monto = monto + this.getPrecio();
            this.reducirStock();
    	}
		return monto;
	}

	public void notificarPago() {		
	}

}
