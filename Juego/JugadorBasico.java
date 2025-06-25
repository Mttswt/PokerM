package juego;

// Implementación básica de un jugador humano
public class JugadorBasico implements Jugador {
    private String nombre;

    public JugadorBasico(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void jugar() {
        System.out.println(nombre + " está tomando una decisión...");
    }

    @Override
    public String getNombre() {
        return nombre;
    }
}