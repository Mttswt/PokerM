package nuevosArchivos;


public interface IGestorJuego {
    int getRondaActual();
    void avanzarRonda();
    void reiniciar();
    String getEstadoActual();
}
