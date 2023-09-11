package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class EquipoDeTrabajo {
	private String nombre;
	private ArrayList<Persona> integrantes;
	
    public EquipoDeTrabajo(String nombre) {
    	this.nombre = nombre;
    	integrantes = new ArrayList<>();
    }

	public String getNombre() {
		return nombre;
	}
	
	public void agregarIntegrante(Persona integrante) {
		integrantes.add(integrante);
	}
	
	public int promedioDeEdad(){	
        int totalEdades = 0;
        for (Persona persona : integrantes) {
            totalEdades = totalEdades + persona.getEdad();
        }
        return totalEdades / integrantes.size();
    }
	
}
