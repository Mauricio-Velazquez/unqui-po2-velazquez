package ar.edu.unq.po2.tp3;

public class Cuadrado extends Rectangulo {
    public Cuadrado(Punto puntoSuperiorIzquierdo, int longitud) {
        super(puntoSuperiorIzquierdo, new Punto(puntoSuperiorIzquierdo.getX() + longitud, puntoSuperiorIzquierdo.getY() - longitud));
    }
}
