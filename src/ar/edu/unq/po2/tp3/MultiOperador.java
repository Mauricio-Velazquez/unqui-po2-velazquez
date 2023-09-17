package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class MultiOperador {
	private List<Integer> numeros;
	
    public MultiOperador() {
        numeros = new ArrayList<Integer>();
    }
	
	public void agregarNumero(int numero) {
		numeros.add(numero);
	}

    public int sumarNumeros() {
        int sumador = 0;
        for (int numero : numeros) {
        	sumador = sumador + numero;
        }
        return sumador;
    }
    
    public int restarNumeros() {
        int restador = 0;
        for (int numero : numeros) {
        	restador = restador - numero;
        }
        return restador;
    }
    
    public int multiplicarNumeros() {
        int multiplicador = 1;
        for (int numero : numeros) {
        	multiplicador = multiplicador * numero;
        }
        return multiplicador;
    }
    
}
