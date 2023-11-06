package ar.edu.unq.po2.tp7;

public enum Color {
	ROJO("Rojo", Riesgo.ALTO, "Gris"), GRIS("Gris", Riesgo.MEDIO, "Amarillo"), AMARILLO("Amarillo", Riesgo.BAJO, "Miel"), MIEL("Miel", Riesgo.MUY_BAJO, "Rojo");
	
	private String descripcion;
	private Riesgo nivelDeRiesgo;
	private String siguienteColor;
	
	Color(String descripcion, Riesgo nivelDeRiesgo, String siguienteColor){
		this.descripcion = descripcion;
		this.nivelDeRiesgo = nivelDeRiesgo;
		this.siguienteColor = siguienteColor;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public Riesgo getNivelDeRiesgo() {
		return nivelDeRiesgo;
	}

	public String getSiguienteColor() {
		return siguienteColor;
	}
	
}

