package ar.edu.unq.po2.tp7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Map;

public class SecretariaDeDeportesDelMunicipioTestCase {
	private ActividadSemanal actividad1;
	private ActividadSemanal actividad2;
	private ActividadSemanal actividad3;
	private ActividadSemanal actividad4;
	private ActividadSemanal actividad5;
	private ActividadSemanal actividad6;
	private SecretariaDeDeportesDelMunicipio secretaria;
	
	@BeforeEach
	public void setUp() {
		actividad1 = new ActividadSemanal(DiaDeLaSemana.LUNES,"16:00", 2, Deporte.RUNNING);
		actividad2 = new ActividadSemanal(DiaDeLaSemana.MARTES, "12:00", 3, Deporte.FUTBOL);
		actividad3 = new ActividadSemanal(DiaDeLaSemana.MIERCOLES, "17:00", 5, Deporte.BASKET);
		actividad4 = new ActividadSemanal(DiaDeLaSemana.JUEVES, "13:30", 5, Deporte.TENNIS);
		actividad5 = new ActividadSemanal(DiaDeLaSemana.VIERNES, "15:00", 6, Deporte.JABALINA);
		actividad6 = new ActividadSemanal(DiaDeLaSemana.DOMINGO, "20:00", 2, Deporte.FUTBOL);
		secretaria = new SecretariaDeDeportesDelMunicipio();
		secretaria.agregarActividad(actividad1);
		secretaria.agregarActividad(actividad2);
		secretaria.agregarActividad(actividad3);
		secretaria.agregarActividad(actividad4);
		secretaria.agregarActividad(actividad5);
		secretaria.agregarActividad(actividad6);
	}
	
	@Test
	public void testTodasLasActividadesDeFutbol() {
		assertEquals(secretaria.todasLasActividadesDeFutbol().size(), 2);
	}
	
	@Test
	public void testTodasLasActividadesDeLaMismaComplejidad() {
		assertEquals(secretaria.todasLasActividadesDeComplejidad(2).size(), 3);
	}
	
	@Test
	public void testCantidadDeHorasTotalesDeActividadesSemanales() {
		assertEquals(secretaria.cantidadDeHorasTotalesDeActividadesSemanales(), 23);
	}
	
	@Test
	public void testActividadSemanalDeMenorCostoDelDeporte() {
		assertEquals(secretaria.actividadSemanalDeMenorCostoDelDeporte(Deporte.FUTBOL), actividad2);
	}	
	
	@Test
	public void testActividadMasEconomicaPorDeporte() {
        Map<Deporte, ActividadSemanal> resultado = secretaria.actividadMasEconomicaPorDeporte();
        assertFalse(resultado.isEmpty());
	}	
		
	@Test
	public void testImprimirTodasLasActividadesOrganizadas() {
		secretaria.imprimirTodasLasActividadesOrganizadas();
	}	
	
}