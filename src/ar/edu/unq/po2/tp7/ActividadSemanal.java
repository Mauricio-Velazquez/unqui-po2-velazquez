package ar.edu.unq.po2.tp7;

public class ActividadSemanal {
	private DiaDeLaSemana dia;
	private String horaDeInicio;
	private int duracion;
	private Deporte deporte;
	
	ActividadSemanal(DiaDeLaSemana dia, String horaDeInicio, int duracion, Deporte deporte){
		this.dia = dia;
		this.horaDeInicio = horaDeInicio;
		this.duracion = duracion;
		this.deporte = deporte;
	}

	public Deporte getDeporte() {
		return deporte;
	}

	public DiaDeLaSemana getDia() {
		return dia;
	}

	public String getHoraDeInicio() {
		return horaDeInicio;
	}

	public int getDuracion() {
		return duracion;
	}
	
	public int calcularCosto() {
		int costoBase = 0;
        if (dia.ordinal() >= DiaDeLaSemana.LUNES.ordinal() && dia.ordinal() <= DiaDeLaSemana.MIERCOLES.ordinal()) {
            costoBase = 500 * this.duracion;
        } else {
            costoBase = 1000 * this.duracion;
        }
        int costoTotal = costoBase + deporte.getComplejidad() * 200;
        return costoTotal;
	}
	
    @Override
    public String toString() {
        String diaString = dia.toString(); 
        return "Deporte: " + deporte + ". Dia: " + diaString + " A LAS: " + horaDeInicio + " . Duracion: " + duracion + " hora(s).";
    }
}
