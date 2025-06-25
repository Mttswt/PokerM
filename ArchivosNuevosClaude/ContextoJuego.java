package nuevosArchivos;

public class ContextoJuego {
    private IGestorJuego gestorJuego;
    private IGestorBaraja gestorBaraja;
    private FachadaJuegoPoker fachada;
    
    public ContextoJuego() {
        this.gestorBaraja = new GestorBarajaImpl();
        this.gestorJuego = GestorJuegoFactory.crearGestorProduccion();
        this.fachada = new FachadaJuegoPoker(gestorJuego, gestorBaraja);
    }
    
    // Getters para inyección
    public IGestorJuego getGestorJuego() { return gestorJuego; }
    public IGestorBaraja getGestorBaraja() { return gestorBaraja; }
    public FachadaJuegoPoker getFachada() { return fachada; }
}