package ar.edu.unq.po2.tp7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class SecretariaDeDeportesDelMunicipio {
	private List<ActividadSemanal> actividades;
	
	SecretariaDeDeportesDelMunicipio(){
		actividades = new ArrayList<ActividadSemanal>();
	}
	
	public void agregarActividad(ActividadSemanal actividad) {
		actividades.add(actividad);
	}
	
	public List<ActividadSemanal> todasLasActividadesDeFutbol(){
		return actividades.stream().filter(actividad -> actividad.getDeporte() == Deporte.FUTBOL).toList();
	}
	
	public List<ActividadSemanal> todasLasActividadesDeComplejidad(int complejidad){
		return actividades.stream().filter(actividad -> actividad.getDeporte().getComplejidad() == complejidad).toList();
	}
	
	public int cantidadDeHorasTotalesDeActividadesSemanales(){
		return actividades.stream().mapToInt(actividad -> actividad.getDuracion()).sum();
	}
		
	public ActividadSemanal actividadSemanalDeMenorCostoDelDeporte(Deporte deporte) {
        return actividades.stream()
        		.filter(actividad -> actividad.getDeporte() == deporte)
                .min(Comparator.comparing(ActividadSemanal::calcularCosto))
        		.orElse(null);
    }
	
    public Map<Deporte, ActividadSemanal> actividadMasEconomicaPorDeporte() {
        return actividades.stream()
                .collect(Collectors.groupingBy(ActividadSemanal::getDeporte,
                        Collectors.collectingAndThen(
                                Collectors.minBy(Comparator.comparing(ActividadSemanal::calcularCosto)),
                                Optional::get)));
    }
        
    public void imprimirTodasLasActividadesOrganizadas() {
        for (ActividadSemanal actividad : actividades) {
            System.out.println(actividad);
        }
    }
}
