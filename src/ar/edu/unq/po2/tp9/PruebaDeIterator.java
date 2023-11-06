package ar.edu.unq.po2.tp9;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

public class PruebaDeIterator {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 3");

        // Obtener un Iterator del ArrayList
        Iterator<String> iterator = lista.iterator();

        // Adaptar el Iterator a Enumeration usando el adaptador
        Enumeration<Object> enumeration = new IteratorAUnEnumeration(iterator);

        // Utilizar Enumeration para acceder a los elementos
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
