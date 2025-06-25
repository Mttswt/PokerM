/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nuevos3A;

public class EstadoTurn extends EstadoJuego {
    @Override
    public void iniciarPartida() { accionNoValida("iniciar partida"); }
    
    @Override
    public void repartirCartas() {
        System.out.println("Mostrando 4ta carta comunitaria (Turn)");
    }
    
    @Override
    public void procesarApuesta(String jugador, int cantidad) {
        System.out.println(jugador + " apuesta " + cantidad + " en Turn");
    }
    
    @Override
    public void avanzarRonda() {
        contexto.cambiarEstado(new EstadoRiver());
    }
    
    @Override
    public void finalizarPartida() {
        contexto.cambiarEstado(new EstadoFinalizando());
    }
    
    @Override
    public String getNombre() { return "Turn"; }
}