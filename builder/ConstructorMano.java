package builder;

import dominio.Carta;
import dominio.Mano;
import factory.FabricaCartasJuego;

// Clase abstracta para construir una Mano paso a paso
public abstract class ConstructorMano {

    public ConstructorMano(FabricaCartasJuego fabrica) {
    }
    protected Mano mano;

    // Crea una nueva mano vacía
    public void crearNuevaMano() {
        mano = new Mano();
    }

    // Devuelve la mano construida
    public Mano obtenerMano() {
        return mano;
    }

    // Método obligatorio a implementar: agrega una carta
    public abstract void agregarCarta(Carta carta);

    // Método opcional: construir una mano completa (por defecto, vacío)
    public void construirManoCompleta() {}

    // Devuelve la cantidad actual de cartas en la mano
    public int contarCartas() {
        return mano != null ? mano.getCartas().size() : 0;
    }
    
    public Mano getResultado() {
        return mano;
}
}