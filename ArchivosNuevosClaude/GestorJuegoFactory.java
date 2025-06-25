
package nuevosArchivos;

public class GestorJuegoFactory {
    public static IGestorJuego crearGestorPruebas() {
        return new GestorJuegoImpl(); // Para testing
    }
    
    public static IGestorJuego crearGestorProduccion() {
        return new GestorJuegoImpl(); // Para producción
    }
    
    public static IGestorJuego crearGestorMultijugador() {
        return new GestorJuegoMultijugador(); // Para múltiples partidas
    }
}