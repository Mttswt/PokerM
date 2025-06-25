package command;

import facade.FachadaJuegoPoker;

// Comando para igualar una apuesta
public class ComandoIgualar implements ComandoJuego {
    private final FachadaJuegoPoker juego;
    private final String jugador;
    private final int cantidadAigualar;

    public ComandoIgualar(FachadaJuegoPoker juego, String jugador, int cantidadAigualar) {
        this.juego = juego;
        this.jugador = jugador;
        this.cantidadAigualar = cantidadAigualar;
    }

    @Override
    public void ejecutar() {
        juego.igualar(jugador, cantidadAigualar);
    }
}