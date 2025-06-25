/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nuevos3A;

public class EstadoRiver extends EstadoJuego {
    @Override
    public void iniciarPartida() { accionNoValida("iniciar partida"); }
    
    @Override
    public void repartirCartas() {
        System.out.println("Mostrando 5ta carta comunitaria (River)");
    }
    
    @Override
    public void procesarApuesta(String jugador, int cantidad) {
        System.out.println(jugador + " apuesta " + cantidad + " en River");
    }
    
    @Override
    public void avanzarRonda() {
        contexto.cambiarEstado(new EstadoShowdown());
    }
    
    @Override
    public void finalizarPartida() {
        contexto.cambiarEstado(new EstadoFinalizando());
    }
    
    @Override
    public String getNombre() { return "River"; }
}
