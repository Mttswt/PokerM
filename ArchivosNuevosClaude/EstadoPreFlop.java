/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nuevos3A;

public class EstadoPreFlop extends EstadoJuego {
    private int apuestasRecibidas = 0;
    
    @Override
    public void iniciarPartida() { accionNoValida("iniciar partida"); }
    
    @Override
    public void repartirCartas() { accionNoValida("repartir cartas"); }
    
    @Override
    public void procesarApuesta(String jugador, int cantidad) {
        System.out.println(jugador + " apuesta " + cantidad + " en Pre-Flop");
        apuestasRecibidas++;
        
        if (apuestasRecibidas >= contexto.getJugadores().size()) {
            contexto.cambiarEstado(new EstadoFlop());
        }
    }
    
    @Override
    public void avanzarRonda() {
        contexto.cambiarEstado(new EstadoFlop());
    }
    
    @Override
    public void finalizarPartida() {
        contexto.cambiarEstado(new EstadoFinalizando());
    }
    
    @Override
    public String getNombre() { return "Pre-Flop"; }
}
