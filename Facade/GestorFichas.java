package facade;

import java.util.HashMap;
import java.util.Map;

// Administra las fichas reales de cada jugador
public class GestorFichas {
    private final Map<String, Integer> fichasJugadores;

    public GestorFichas() {
        fichasJugadores = new HashMap<>();
    }

    // Asigna fichas a un jugador (nueva partida o bono)
    public void asignarFichas(String jugador, int cantidad) {
        fichasJugadores.put(jugador, fichasJugadores.getOrDefault(jugador, 0) + cantidad);
    }

    // Resta fichas al jugador si tiene suficiente
    public boolean quitarFichas(String jugador, int cantidad) {
        int actuales = fichasJugadores.getOrDefault(jugador, 0);
        if (cantidad <= actuales) {
            fichasJugadores.put(jugador, actuales - cantidad);
            return true;
        }
        return false;
    }

    // Devuelve el número de fichas actual del jugador
    public int getFichas(String jugador) {
        return fichasJugadores.getOrDefault(jugador, 0);
    }

    // Reinicia las fichas de un jugador
    public void reiniciarFichas(String jugador) {
        fichasJugadores.put(jugador, 0);
    }
}
