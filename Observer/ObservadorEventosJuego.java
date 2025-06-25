package Observer;

// Interfaz que deben implementar todos los observadores
public interface ObservadorEventosJuego {
    void actualizar(String evento, Object data);
}
