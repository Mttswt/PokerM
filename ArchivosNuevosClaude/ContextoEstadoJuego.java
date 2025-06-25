/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nuevos3A;

public class ContextoEstadoJuego {
    private EstadoJuego estadoActual;
    private List<Jugador> jugadores;
    private int rondaActual;
    
    public ContextoEstadoJuego() {
        this.jugadores = new ArrayList<>();
        this.rondaActual = 1;
        this.estadoActual = new EstadoEsperandoJugadores();
        this.estadoActual.setContexto(this);
    }
    
    public void cambiarEstado(EstadoJuego nuevoEstado) {
        this.estadoActual = nuevoEstado;
        this.estadoActual.setContexto(this);
    }
    
    // Delegar acciones al estado actual
    public void iniciarPartida() {
        estadoActual.iniciarPartida();
    }
    
    public void repartirCartas() {
        estadoActual.repartirCartas();
    }
    
    public void procesarApuesta(String jugador, int cantidad) {
        estadoActual.procesarApuesta(jugador, cantidad);
    }
    
    public void avanzarRonda() {
        estadoActual.avanzarRonda();
    }
    
    public void finalizarPartida() {
        estadoActual.finalizarPartida();
    }
    
    // Getters y setters
    public List<Jugador> getJugadores() { return jugadores; }
    public int getRondaActual() { return rondaActual; }
    public void setRondaActual(int ronda) { this.rondaActual = ronda; }
    public String getEstadoActual() { return estadoActual.getNombre(); }
}