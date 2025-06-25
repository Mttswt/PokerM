package decorator;

import juego.Jugador;

// Clase abstracta base para los decoradores de jugadores
public abstract class DecoradorJugador implements Jugador {
    protected Jugador jugador;

    public DecoradorJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    @Override
    public void jugar() {
        jugador.jugar(); // delega la acción al jugador original
    }

    @Override
    public String getNombre() {
        return jugador.getNombre();
    }
}