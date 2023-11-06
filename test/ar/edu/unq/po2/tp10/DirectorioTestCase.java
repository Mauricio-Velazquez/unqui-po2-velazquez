package ar.edu.unq.po2.tp10;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DirectorioTestCase {
    private Directorio directorioRaiz;
	private Archivo archivo1;
	private Archivo archivo2;
	private Archivo archivo3;
	private Directorio subDirectorio;
    
	@BeforeEach
    public void setUp() {
        // Crear la estructura de directorios y archivos para las pruebas
        archivo1 = new Archivo("archivo1.txt", 100, System.currentTimeMillis() - 1000);
        archivo2 = new Archivo("archivo2.txt", 200, System.currentTimeMillis() - 2000);
        archivo3 = new Archivo("archivo3.txt", 300, System.currentTimeMillis() - 3000);
        subDirectorio = new Directorio("subDirectorio", System.currentTimeMillis() - 5000);
        subDirectorio.agregarElemento(archivo1);
        subDirectorio.agregarElemento(archivo2);
        directorioRaiz = new Directorio("directorioRaiz", System.currentTimeMillis() - 4000);
        directorioRaiz.agregarElemento(subDirectorio);
        directorioRaiz.agregarElemento(archivo3);
    }

    @Test
    public void testTotalSize() {
        assertEquals(600, directorioRaiz.totalSize());
    }

    @Test
    public void testLastModified() {
        FyleSystem elementoMasNuevo = directorioRaiz.lastModified();
        elementoMasNuevo.printStructure();
        System.out.println("testLastModified");
    }

    @Test
    public void testOldestElement() {
        FyleSystem elementoMasAntiguo = directorioRaiz.oldestElement();
        elementoMasAntiguo.printStructure();
        System.out.println("testOldestElement");
    }
    
}
