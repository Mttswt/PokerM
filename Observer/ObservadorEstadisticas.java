package Observer;

import java.util.HashMap;
import java.util.Map;

// Observador que registra estadísticas de eventos
public class ObservadorEstadisticas implements ObservadorEventosJuego {
    private final Map<String, Integer> eventosContados;

    public ObservadorEstadisticas() {
        eventosContados = new HashMap<>();
    }

    @Override
    public void actualizar(String evento, Object data) {
        eventosContados.put(evento, eventosContados.getOrDefault(evento, 0) + 1);
    }

    public int getConteoEvento(String evento) {
        return eventosContados.getOrDefault(evento, 0);
    }
}
