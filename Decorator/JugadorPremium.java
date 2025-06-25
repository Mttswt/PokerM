package decorator;

import juego.Jugador;

// Decorador concreto que añade beneficios premium al jugador
public class JugadorPremium extends DecoradorJugador {

    public JugadorPremium(Jugador jugador) {
        super(jugador);
    }

    @Override
    public void jugar() {
        System.out.println("[PREMIUM] Doble oportunidad este turno.");
        super.jugar();
    }

    public void accesoEstadisticasAvanzadas() {
        System.out.println(getNombre() + " accede a estadísticas premium.");
    }
}
