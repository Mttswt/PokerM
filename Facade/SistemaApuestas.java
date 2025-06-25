package facade;

import java.util.HashMap;
import java.util.Map;

// Registra las apuestas activas de cada jugador
public class SistemaApuestas {
    private final Map<String, Integer> apuestas;

    public SistemaApuestas() {
        apuestas = new HashMap<>();
    }

    public void realizarApuesta(String jugador, int cantidad) {
        apuestas.put(jugador, apuestas.getOrDefault(jugador, 0) + cantidad);
    }

    public void igualarApuesta(String jugador, int cantidad) {
        apuestas.put(jugador, cantidad); // iguala a la mayor apuesta
    }

    public void retirarse(String jugador) {
        apuestas.remove(jugador); // se retira, no apuesta más
    }

    public int getApuesta(String jugador) {
        return apuestas.getOrDefault(jugador, 0);
    }

    public void reiniciar() {
        apuestas.clear();
    }
}
