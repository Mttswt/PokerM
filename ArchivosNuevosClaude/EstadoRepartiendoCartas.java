/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nuevos3A;

public class EstadoRepartiendoCartas extends EstadoJuego {
    @Override
    public void iniciarPartida() { accionNoValida("iniciar partida"); }
    
    @Override
    public void repartirCartas() {
        System.out.println("Repartiendo cartas iniciales...");
        // Lógica de reparto
        contexto.cambiarEstado(new EstadoPreFlop());
    }
    
    @Override
    public void procesarApuesta(String jugador, int cantidad) { 
        accionNoValida("procesar apuesta"); 
    }
    
    @Override
    public void avanzarRonda() { accionNoValida("avanzar ronda"); }
    
    @Override
    public void finalizarPartida() {
        contexto.cambiarEstado(new EstadoFinalizando());
    }
    
    @Override
    public String getNombre() { return "Repartiendo Cartas"; }
}