package juego;

// Representa un asiento en la mesa
public class Asiento {
    private int numero;
    private Jugador jugador;

    public Asiento(int numero) {
        this.numero = numero;
    }

    public boolean estaOcupado() {
        return jugador != null;
    }

    public void asignarJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public int getNumero() {
        return numero;
    }

    public void liberar() {
        jugador = null;
    }
}
