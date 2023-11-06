package ar.edu.unq.po2.tp8;

public class Carta {
    private String valor;
    private String palo;

    public Carta(String valor, String palo) {
        this.valor = valor;
        this.palo = palo;
    }

    public String getValor() {
        return valor;
    }

    public String getPalo() {
        return palo;
    }
    
    public boolean esMayorQue(Carta otraCarta) {
        return obtenerValorNumerico(this.valor) > obtenerValorNumerico(otraCarta.valor);
    }

    public boolean tieneMismoPalo(Carta otraCarta) {
        return this.palo.equals(otraCarta.palo);
    }

    public int obtenerValorNumerico(String valor) {
        switch (valor) {
            case "J":
                return 11;
            case "Q":
                return 12;
            case "K":
                return 13;
            case "A":
                return 14;
            default:
                return Integer.parseInt(valor);
        }
    }
}
