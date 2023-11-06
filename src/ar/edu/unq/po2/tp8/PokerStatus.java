package ar.edu.unq.po2.tp8;

import java.util.ArrayList;
import java.util.List;

public class PokerStatus {
		
	public String verificar(String carta1, String carta2, String carta3, String carta4, String carta5) {
		int dieces = 0;
		int tamaño = 0;
		int palo = 0;
		List<String> cartas = new ArrayList<String>();
		cartas.add(carta1);
		cartas.add(carta2);
		cartas.add(carta3);
		cartas.add(carta4);
		cartas.add(carta5);
		dieces = (cartas.stream().filter(c -> c.startsWith("10")).toList()).size();	
		for(String carta : cartas) {
			tamaño = (cartas.stream().filter(c -> c.startsWith(carta.substring(0, carta.length() - 1))).toList()).size();			
			palo = (cartas.stream().filter(c -> c.endsWith(carta.substring(carta.length() - 1))).toList()).size();
			if((tamaño - dieces) == 4 || dieces == 4) {
				return "Poker";
			}
			if((tamaño - dieces) == 3 || dieces == 3) {
				return "Trio";
			}
			if(palo == 5) {
				return "Color";
			}
		}
		return "Nada";
	}

	public String verificar2(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		int tamaño = 0;
		int palo = 0;
		List<Carta> cartas = new ArrayList<Carta>();
		cartas.add(carta1);
		cartas.add(carta2);
		cartas.add(carta3);
		cartas.add(carta4);
		cartas.add(carta5);	
		for(Carta carta : cartas) {
			tamaño = (cartas.stream().filter(c -> c.obtenerValorNumerico(c.getValor()) == carta.obtenerValorNumerico(carta.getValor())).mapToInt(c -> 1)).sum();
			palo = (cartas.stream().filter(c -> c.tieneMismoPalo(carta)).mapToInt(c -> 1)).sum();
			if(tamaño == 4) {
				return "Poker";
			}
			if(tamaño == 3) {
				return "Trio";
			}
			if(palo == 5) {
				return "Color";
			}
		}
		return "Nada";
	}
}
