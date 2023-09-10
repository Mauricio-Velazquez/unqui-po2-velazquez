package ar.edu.unq.po2.tp3;

public class MayorMultiplo {

    public static int encontrarMayorMultiplo(int x, int y) {
        for (int i = 1000; i > 0; i--) {
            if (i % x == 0 && i % y == 0) {
            	return i;
            }
        }
        return -1; // No se encontró ningún múltiplo común en el rango.
    }

    public static void main(String[] args) {
        int x = 3;
        int y = 9;
        int resultado = encontrarMayorMultiplo(x, y);
        
        if (resultado != -1) {
            System.out.println("El numero mas alto multiplo simultaneamente de " + x + " y " + y + " es: " + resultado);
        } else {
            System.out.println("No se encontro ningun numero en el rango de 0 a 1000 que sea multiplo simultaneamente de " + x + " y " + y);
        }
    }
}
