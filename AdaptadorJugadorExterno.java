package adapter;

// Adaptador que convierte un JugadorLegado en un Jugador compatible

import juego.Jugador;

public class AdaptadorJugadorExterno implements Jugador {
    private JugadorAnterior jugadorAnterior;

    public AdaptadorJugadorExterno(JugadorAnterior jugadorAnterior) {
        this.jugadorAnterior = jugadorAnterior;
    }

    // Adapta el método del legado al nuevo sistema
    @Override
    public void jugar() {
        jugadorAnterior.jugarTurno();
    }

    @Override
    public String getNombre() {
        return jugadorAnterior.obtenerNombre();
    }
}