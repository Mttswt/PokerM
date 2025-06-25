/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nuevos3A;

public class EstadoShowdown extends EstadoJuego {
    @Override
    public void iniciarPartida() { accionNoValida("iniciar partida"); }
    
    @Override
    public void repartirCartas() { accionNoValida("repartir cartas"); }
    
    @Override
    public void procesarApuesta(String jugador, int cantidad) { 
        accionNoValida("procesar apuesta"); 
    }
    
    @Override
    public void avanzarRonda() {
        System.out.println("Evaluando manos y determinando ganador...");
        contexto.cambiarEstado(new EstadoFinalizando());
    }
    
    @Override
    public void finalizarPartida() {
        contexto.cambiarEstado(new EstadoFinalizando());
    }
    
    @Override
    public String getNombre() { return "Showdown"; }
}
