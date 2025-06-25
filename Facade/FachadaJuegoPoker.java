package facade;

import dominio.Mano;
import dominio.TipoMano;

// Interfaz unificada para operaciones del juego
public class FachadaJuegoPoker {
    private final SistemaApuestas sistemaApuestas;
    private final GestorFichas gestorFichas;
    private final EvaluadorManos evaluadorManos;

    public FachadaJuegoPoker() {
        sistemaApuestas = new SistemaApuestas();
        gestorFichas = new GestorFichas();
        evaluadorManos = new EvaluadorManos();
    }

    public void iniciarPartida(String jugador) {
        gestorFichas.asignarFichas(jugador, 1000);
    }

    public boolean apostar(String jugador, int cantidad) {
        if (gestorFichas.quitarFichas(jugador, cantidad)) {
            sistemaApuestas.realizarApuesta(jugador, cantidad);
            return true;
        }
        return false; // no tiene suficientes fichas
    }

    public void igualar(String jugador, int cantidadAigualar) {
        if (gestorFichas.quitarFichas(jugador, cantidadAigualar)) {
            sistemaApuestas.igualarApuesta(jugador, cantidadAigualar);
        }
    }

    public void retirarse(String jugador) {
        sistemaApuestas.retirarse(jugador);
    }

    public TipoMano evaluarMano(String jugador, Mano mano) {
        TipoMano tipo = evaluadorManos.evaluar(mano);
        mano.setTipoMano(tipo);
        return tipo;
    }

    public int consultarFichas(String jugador) {
        return gestorFichas.getFichas(jugador);
    }

    public int consultarApuesta(String jugador) {
        return sistemaApuestas.getApuesta(jugador);
    }
}