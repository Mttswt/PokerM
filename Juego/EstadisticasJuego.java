package juego;

import java.util.HashMap;
import java.util.Map;

// Lleva estadísticas generales del juego
public class EstadisticasJuego {
    private Map<String, Integer> fichasAcumuladas;
    private Map<String, Integer> rondasJugadas;

    public EstadisticasJuego() {
        fichasAcumuladas = new HashMap<>();
        rondasJugadas = new HashMap<>();
    }

    public void registrarFichas(String jugador, int fichas) {
        fichasAcumuladas.put(jugador, fichasAcumuladas.getOrDefault(jugador, 0) + fichas);
    }

    public void registrarRonda(String jugador) {
        rondasJugadas.put(jugador, rondasJugadas.getOrDefault(jugador, 0) + 1);
    }

    public int getTotalFichas(String jugador) {
        return fichasAcumuladas.getOrDefault(jugador, 0);
    }

    public int getRondasJugadas(String jugador) {
        return rondasJugadas.getOrDefault(jugador, 0);
    }
}