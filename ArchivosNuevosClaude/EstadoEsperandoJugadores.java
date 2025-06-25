/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nuevos3A;

public class EstadoEsperandoJugadores extends EstadoJuego {
    @Override
    public void iniciarPartida() {
        if (contexto.getJugadores().size() >= 2) {
            System.out.println("Iniciando partida con " + contexto.getJugadores().size() + " jugadores");
            contexto.cambiarEstado(new EstadoRepartiendoCartas());
            contexto.repartirCartas();
        } else {
            System.out.println("Se necesitan al menos 2 jugadores para iniciar");
        }
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
        System.out.println("Partida cancelada - no hay suficientes jugadores");
    }
    
    @Override
    public String getNombre() { return "Esperando Jugadores"; }
}