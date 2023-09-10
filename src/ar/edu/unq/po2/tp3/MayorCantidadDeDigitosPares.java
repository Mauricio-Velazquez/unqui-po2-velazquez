package ar.edu.unq.po2.tp3;

public class MayorCantidadDeDigitosPares {

    public static int contarDigitosPares(int numero) {
        int contador = 0;
        while (numero != 0) {
            int digito = numero % 10;
            if (digito % 2 == 0) {
                contador++;
            }
            numero /= 10;
        }
        return contador;
    }

    public static int encontrarNumeroConMasDigitosPares(int[] numeros) {
        int numeroConMasDigitosPares = 0;
        int maxDigitosPares = 0;

        for (int numero : numeros) {
            int digitosPares = contarDigitosPares(numero);
            if (digitosPares > maxDigitosPares) {
                maxDigitosPares = digitosPares;
                numeroConMasDigitosPares = numero;
            }
        }

        return numeroConMasDigitosPares;
    }

    public static void main(String[] args) {
        int[] arregloNumeros = {1234, 5678, 24680, 13579};
        int resultado = encontrarNumeroConMasDigitosPares(arregloNumeros);
        System.out.println("El numero con la mayor cantidad de digitos pares es: " + resultado);
    }
}
