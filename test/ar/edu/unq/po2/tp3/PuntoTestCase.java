package ar.edu.unq.po2.tp3;

public class PuntoTestCase {
    public static void main(String[] args) {
        Punto punto1 = new Punto(2, 3);
        Punto punto2 = new Punto(); 
        Punto punto3 = new Punto(5, 5);

        System.out.println("Punto 1: " + punto1); 
        System.out.println("Punto 2: " + punto2); 

        punto1.mover(4, 5);
        System.out.println("Punto 1 despues de moverlo: " + punto1); 

        Punto resultado = punto1.sumarPunto(punto3);
        System.out.println("Resultado de la suma: " + resultado); 
    }
    
}
