/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nuevos3A;

public class FachadaJuegoPokerMejorada {
    private ContextoEstadoJuego contextoEstado;
    private SistemaApuestas sistemaApuestas;
    private GestorFichas gestorFichas;
    
    public FachadaJuegoPokerMejorada() {
        this.contextoEstado = new ContextoEstadoJuego();
        this.sistemaApuestas = new SistemaApuestas();
        this.gestorFichas = new GestorFichas();
    }
    
    public void iniciarPartida() {
        contextoEstado.iniciarPartida();
    }
    
    public boolean apostar(String jugador, int cantidad) {
        if (gestorFichas.quitarFichas(jugador, cantidad)) {
            contextoEstado.procesarApuesta(jugador, cantidad);
            sistemaApuestas.realizarApuesta(jugador, cantidad);
            return true;
        }
        return false;
    }
    
    public String getEstadoJuego() {
        return contextoEstado.getEstadoActual();
    }
    
    public void avanzarFase() {
        contextoEstado.avanzarRonda();
    }
}