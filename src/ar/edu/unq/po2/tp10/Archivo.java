package ar.edu.unq.po2.tp10;

public class Archivo implements FyleSystem{
	private String nombre;
	private int tamaño;
	private long ultimaModificacion;
	
	Archivo(String nombre, int tamaño, long ultimaModificacion){
		this.nombre = nombre;
		this.tamaño = tamaño;
		this.ultimaModificacion = ultimaModificacion;
	}
	
	@Override
	public int totalSize() {
		return tamaño;
	}
	
	@Override
	public void printStructure() {
		System.out.println(nombre);	
	}
	
	@Override
	public FyleSystem lastModified() {
		return this;
	}
	
	@Override
	public FyleSystem oldestElement() {
		return this;
	}

	@Override
	public long getFechaModificacion() {
		return ultimaModificacion;
	}

	@Override
	public long getFechaCreacion() {
		return 0;
	}
	
}
