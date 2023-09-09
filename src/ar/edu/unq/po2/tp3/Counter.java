package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Counter{
	private List<Integer> numeros;
	
    public Counter() {
        numeros = new ArrayList<>();
    }
	
	public void addNumber(int numero) {
		numeros.add(numero);
	}

	public int getEvenOcurrences() {
		return numeros.size();
	}
	
}