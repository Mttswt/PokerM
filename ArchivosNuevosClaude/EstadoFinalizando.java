/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nuevos3A;

public class EstadoFinalizando extends EstadoJuego {
    @Override
    public void iniciarPartida() {
        // Reiniciar para nueva partida
        contexto.setRondaActual(1);
        contexto.cambiarEstado(new EstadoEsperandoJugadores());
    }
    
    @Override
    public void repartirCartas() { accionNoValida("repartir cartas"); }
    
    @Override
    public void procesarApuesta(String jugador, int cantidad) { 
        accionNoValida("procesar apuesta"); 
    }
    
    @Override
    public void avanzarRonda() { accionNoValida("avanzar ronda"); }
    
    @Override
    public void finalizarPartida() {
        System.out.println("Partida finalizada. Limpiando recursos...");
    }
    
    @Override
    public String getNombre() { return "Finalizando"; }
}
