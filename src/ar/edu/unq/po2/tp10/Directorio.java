package ar.edu.unq.po2.tp10;

import java.util.ArrayList;
import java.util.List;

public class Directorio implements FyleSystem{
    private String nombre;
    private long fechaCreacion;
	private List<FyleSystem> elementos;
	
	Directorio(String nombre, long fechaCreacion){
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        elementos = new ArrayList<FyleSystem>();
    }
	
	public void agregarElemento(FyleSystem elemento) {
		elementos.add(elemento);
    }

    @Override
    public int totalSize() {
        int total = 0;
        for (FyleSystem elemento : elementos) {
            total += elemento.totalSize();
        }
        return total;
    }

    @Override
    public void printStructure() {
        System.out.println(nombre);
        for (FyleSystem elemento : elementos) {
            elemento.printStructure();
        }
    }

    @Override
    public FyleSystem lastModified() {
        FyleSystem masNuevo = this;
        long ultimaModificacion = 0;
        for (FyleSystem elemento : elementos) {
            if (elemento.lastModified().getFechaModificacion() > ultimaModificacion) {
                masNuevo = elemento;
                ultimaModificacion = elemento.lastModified().getFechaModificacion();
            }
        }
        return masNuevo;
    }

    @Override
    public FyleSystem oldestElement() {
        FyleSystem masAntiguo = this;
        long fechaCreacionMasAntiguo = this.fechaCreacion; // Inicializar con la fecha de creación del directorio actual
        for (FyleSystem elemento : elementos) {
            if (elemento.getFechaCreacion() < fechaCreacionMasAntiguo) {
                masAntiguo = elemento;
                fechaCreacionMasAntiguo = elemento.getFechaCreacion();
            }
        }
        return masAntiguo;
    }

	@Override
	public long getFechaModificacion() {
		return 0;
	}

	@Override
	public long getFechaCreacion() {
		return fechaCreacion;
	}
	
}
	
