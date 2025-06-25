package command;

import facade.FachadaJuegoPoker;

// Comando para retirarse del juego
public class ComandoRetirarse implements ComandoJuego {
    private final FachadaJuegoPoker juego;
    private final String jugador;

    public ComandoRetirarse(FachadaJuegoPoker juego, String jugador) {
        this.juego = juego;
        this.jugador = jugador;
    }

    @Override
    public void ejecutar() {
        juego.retirarse(jugador);
    }
}
