package ar.edu.unq.po2.tp9;

import java.util.Enumeration;
import java.util.Iterator;

// Adaptador de Objeto
public class IteratorAUnEnumeration implements Enumeration<Object> {
    private Iterator<?> iterator;

    public IteratorAUnEnumeration(Iterator<?> iterator) {
        this.iterator = iterator;
    }

    // Implementación del método hasMoreElements() de la interfaz Enumeration
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    // Implementación del método nextElement() de la interfaz Enumeration
    public Object nextElement() {
        return iterator.next();
    }
}
