package ar.edu.unq.po2.tp3;

public class Punto {
    private int x;
    private int y;

    public Punto() {
        this.x = 0;
        this.y = 0;
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void mover(int nuevoX, int nuevoY) {
        this.x = nuevoX;
        this.y = nuevoY;
    }

    public Punto sumarPunto(Punto otroPunto) {
        int nuevoX = this.x + otroPunto.getX();
        int nuevoY = this.y + otroPunto.getY();
        return new Punto(nuevoX, nuevoY);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}
