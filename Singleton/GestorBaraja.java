package singleton;

import dominio.Baraja;

// Singleton para compartir una única baraja en todo el juego
public class GestorBaraja {
    private static GestorBaraja instancia;
    private Baraja baraja;

    private GestorBaraja() {
        baraja = new Baraja(); // crea una nueva baraja y la mezcla
        baraja.mezclar();
    }

    public static GestorBaraja getInstancia() {
        if (instancia == null) {
            instancia = new GestorBaraja();
        }
        return instancia;
    }

    public Baraja getBaraja() {
        return baraja;
    }

    public void reiniciarBaraja() {
        baraja = new Baraja();
        baraja.mezclar();
    }
}