package ar.edu.unq.po2.tp9;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ListaDePalabrasOrdenadas {
    private List<String> palabras;
    private final Comparator<String> comparador;

    public ListaDePalabrasOrdenadas() {
        this.palabras = new LinkedList<String>();
        this.comparador = new Comparator<String>() {
            @Override
            public int compare(String palabraA, String palabraB) {
                String a = palabraA.toLowerCase();
                String b = palabraB.toLowerCase();
                return a.compareTo(b);
            }
        };
    }

    public void agregarPalabra(String palabra) {
        this.palabras.add(palabra);
        Collections.sort(this.palabras, this.comparador);
    }

    public Integer cantidadDePalabras() {
        return this.palabras.size();
    }

    public String getPalabraDePosicion(int posicion) {
        return this.palabras.get(posicion);
    }
    
    public List<String> getPalabras() {
        return this.palabras;
    }
}
