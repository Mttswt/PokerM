/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nuevos3A;

public abstract class EstadoJuego {
    protected ContextoEstadoJuego contexto;
    
    public void setContexto(ContextoEstadoJuego contexto) {
        this.contexto = contexto;
    }
    
    public abstract void iniciarPartida();
    public abstract void repartirCartas();
    public abstract void procesarApuesta(String jugador, int cantidad);
    public abstract void avanzarRonda();
    public abstract void finalizarPartida();
    public abstract String getNombre();
    
    // Método helper para acciones no válidas
    protected void accionNoValida(String accion) {
        System.out.println("Acción '" + accion + "' no válida en estado: " + getNombre());
    }
}