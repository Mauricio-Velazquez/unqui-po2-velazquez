package ar.edu.unq.po2.tp8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class GuerreroDelAzarTestCase {

	private IGuerrero guerrero;
	private IGuerrero unGuerrero;
	private IMoneda moneda;
		
	@BeforeEach
	public void setUp() {
		this.moneda = mock(IMoneda.class);
		this.unGuerrero = mock(IGuerrero.class);
		
		this.guerrero = new GuerreroDelAzar(100, 50, moneda);
	}
	
	@Test
	public void testUnGuerreroDelAzarAtacaAOtroGuerreroYLaMonedaSaleCaraDescuentanPuntosDeVidaDelAdversario() {		
		when(this.moneda.esCara()).thenReturn(true);
		
		this.guerrero.atacar(this.unGuerrero);
		
		verify(this.unGuerrero).descontarVida(50);
	}	
	
	@Test
	public void testUnGuerreroDelAzarAtacaAOtroGuerreroYLaMonedaSaleCruzDescuentanPuntosDeVidaDeSiMismo() {	
		this.guerrero.atacar(this.unGuerrero);
		
		verifyZeroInteractions(this.unGuerrero);
		verify(this.unGuerrero, never()).descontarVida(50);
	}
	
}