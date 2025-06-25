package dominio;
//Clase que representa cada carta
public class Carta {
    private final Palo palo;
    private final Valor valor;

    public Carta(Palo palo, Valor valor) {
        this.palo = palo;
        this.valor = valor;
    }
    
    // retorna el palo de la carta
    public Palo getPalo() {
        return palo;
    }
    
    //retorna el numero de la carta
    public Valor getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return valor + " de " + palo;
    }
}