package ar.edu.unq.po2.tp5;

public class Servicio extends Factura {
	private String nombre;
	private double costoPorUnidadConsumida;
	private int cantidadDeUnidadesConsumidas;
	private String periodoFacturado;
	
	Servicio(String nombre, double costoPorUnidadConsumida, int cantidadDeUnidadesConsumidas, String periodoFacturado){
		this.nombre = nombre;
		this.costoPorUnidadConsumida = costoPorUnidadConsumida;
		this.cantidadDeUnidadesConsumidas = cantidadDeUnidadesConsumidas;
		this.periodoFacturado = periodoFacturado;
	}
	
	public String getNombre() {
		return nombre;
	}
		
	public double getCostoPorUnidadConsumida() {
		return costoPorUnidadConsumida;
	}
	
	public int getCantidadDeUnidadesConsumidas() {
		return cantidadDeUnidadesConsumidas;
	}
	
	public String getPeriodoFacturado() {
		return periodoFacturado;
	}
	
	public double montoAPagar() {
		return costoPorUnidadConsumida * cantidadDeUnidadesConsumidas;
	}

	public void notificarPago() {
		System.out.println("Pago registrado para la factura: " + this.getNombre() + " por un monto de $" + this.montoAPagar());
	}
	
}
