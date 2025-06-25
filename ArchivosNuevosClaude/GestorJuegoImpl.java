
package nuevosArchivos;

public class GestorJuegoImpl implements IGestorJuego {
    private int rondaActual;
    private EstadoJuego estadoActual;
    
    public GestorJuegoImpl() {
        this.rondaActual = 1;
        this.estadoActual = EstadoJuego.ESPERANDO_JUGADORES;
    }
    
    @Override
    public int getRondaActual() { return rondaActual; }
    
    @Override
    public void avanzarRonda() { 
        rondaActual++;
        // Lógica de transición de estado
    }
    
    @Override
    public void reiniciar() {
        rondaActual = 1;
        estadoActual = EstadoJuego.ESPERANDO_JUGADORES;
    }
    
    @Override
    public String getEstadoActual() {
        return estadoActual.toString();
    }
}