package singleton;

// Clase Singleton para gestionar el estado general del juego
public class GestorJuego {
    private static GestorJuego instancia;

    private int rondaActual;

    // Constructor privado para evitar instanciación externa
    private GestorJuego() {
        rondaActual = 1;
    }

    // Devuelve la única instancia de la clase
    public static GestorJuego getInstancia() {
        if (instancia == null) {
            instancia = new GestorJuego();
        }
        return instancia;
    }

    public int getRondaActual() {
        return rondaActual;
    }

    public void avanzarRonda() {
        rondaActual++;
    }

    public void reiniciar() {
        rondaActual = 1;
    }
}