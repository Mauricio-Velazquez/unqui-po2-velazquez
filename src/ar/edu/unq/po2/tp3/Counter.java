package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter{
	private ArrayList<Integer> numeros;
	
    public Counter() {
        numeros = new ArrayList<>();
    }
	
	public void addNumber(int numero) {
		numeros.add(numero);
	}

    public int contarPares() {
        int contador = 0;
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                contador++;
            }
        }
        return contador;
    }
	
    public int contarImpares() {
    	int contador = 0;
        for (int numero : numeros) {
            if (numero % 2 == 0) {
            }
            else {
            	 contador++;
            }
        }
        return contador;
    }
    
    public int contarMultiplosDe(int numero) {
        int contador = 0;
        for (int num : numeros) {
            if (num % numero == 0) {
                contador++;
            }
        }
        return contador;
    }
    
}