package decorator;

import juego.Jugador;

// Decorador concreto que añade beneficios VIP al jugador
public class JugadorVIP extends DecoradorJugador {

    public JugadorVIP(Jugador jugador) {
        super(jugador);
    }

    @Override
    public void jugar() {
        System.out.println("[VIP] Acceso anticipado al turno.");
        super.jugar(); // llama al comportamiento original
    }

    public void bonoVIP() {
        System.out.println(getNombre() + " recibe un bono de fichas VIP.");
    }
}
