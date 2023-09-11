package ar.edu.unq.po2.tp3;

public class Rectangulo {
    private Punto puntoSuperiorIzquierdo; 
    private Punto puntoInferiorDerecho; 

    public Rectangulo(Punto puntoSuperiorIzquierdo, Punto puntoInferiorDerecho) {
        this.puntoSuperiorIzquierdo = puntoSuperiorIzquierdo;
        this.puntoInferiorDerecho = puntoInferiorDerecho;
    }

    public int obtenerArea() {
        int ancho = puntoInferiorDerecho.getX() - puntoSuperiorIzquierdo.getX();
        int altura = puntoSuperiorIzquierdo.getY() - puntoInferiorDerecho.getY();
        return ancho * altura;
    }

    public int obtenerPerimetro() {
        int ancho = puntoInferiorDerecho.getX() - puntoSuperiorIzquierdo.getX();
        int altura = puntoSuperiorIzquierdo.getY() - puntoInferiorDerecho.getY();
        return 2 * (ancho + altura);
    }

    public boolean esHorizontal() {
        int ancho = puntoInferiorDerecho.getX() - puntoSuperiorIzquierdo.getX();
        int altura = puntoSuperiorIzquierdo.getY() - puntoInferiorDerecho.getY();
        return ancho > altura;
    }

    public boolean esVertical() {
        int ancho = puntoInferiorDerecho.getX() - puntoSuperiorIzquierdo.getX();
        int altura = puntoSuperiorIzquierdo.getY() - puntoInferiorDerecho.getY();
        return altura > ancho;
    }
    
}
