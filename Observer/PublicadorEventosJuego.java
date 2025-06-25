package Observer;

import java.util.ArrayList;
import java.util.List;

// Clase observable que emite eventos a todos los observadores registrados
public class PublicadorEventosJuego {
    private final List<ObservadorEventosJuego> observadores;

    public PublicadorEventosJuego() {
        this.observadores = new ArrayList<>();
    }

    public void registrarObservador(ObservadorEventosJuego observador) {
        observadores.add(observador);
    }

    public void eliminarObservador(ObservadorEventosJuego observador) {
        observadores.remove(observador);
    }

    // Notifica a todos los observadores sobre un evento
    public void notificar(String evento, Object data) {
        for (ObservadorEventosJuego observador : observadores) {
            observador.actualizar(evento, data);
        }
    }
}
