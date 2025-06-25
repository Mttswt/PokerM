/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nuevos3A;

public class EstadoFlop extends EstadoJuego {
    @Override
    public void iniciarPartida() { accionNoValida("iniciar partida"); }
    
    @Override
    public void repartirCartas() {
        System.out.println("Mostrando 3 cartas comunitarias (Flop)");
    }
    
    @Override
    public void procesarApuesta(String jugador, int cantidad) {
        System.out.println(jugador + " apuesta " + cantidad + " en Flop");
    }
    
    @Override
    public void avanzarRonda() {
        contexto.cambiarEstado(new EstadoTurn());
    }
    
    @Override
    public void finalizarPartida() {
        contexto.cambiarEstado(new EstadoFinalizando());
    }
    
    @Override
    public String getNombre() { return "Flop"; }
}