package command;

import java.util.ArrayList;
import java.util.List;

// Ejecuta comandos y guarda historial
public class InvocadorComandos {
    private final List<ComandoJuego> historial;

    public InvocadorComandos() {
        historial = new ArrayList<>();
    }

    // Ejecuta y guarda el comando
    public void ejecutarComando(ComandoJuego comando) {
        comando.ejecutar();
        historial.add(comando);
    }

    public List<ComandoJuego> getHistorial() {
        return historial;
    }
}
