    package command;

import facade.FachadaJuegoPoker;

// Comando concreto para realizar una apuesta
public class ComandoApostar implements ComandoJuego {
    private final FachadaJuegoPoker juego;
    private final String jugador;
    private final int cantidad;

    public ComandoApostar(FachadaJuegoPoker juego, String jugador, int cantidad) {
        this.juego = juego;
        this.jugador = jugador;
        this.cantidad = cantidad;
    }

    @Override
    public void ejecutar() {
        boolean exito = juego.apostar(jugador, cantidad);
        if (!exito) {
            System.out.println(jugador + " no tiene suficientes fichas para apostar " + cantidad);
        }
    }
}
