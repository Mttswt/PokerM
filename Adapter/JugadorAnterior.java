/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter;

// Clase de un jugador legado que no implementa la interfaz Jugador
public class JugadorAnterior {
    private String nombre;

    public JugadorAnterior(String nombre) {
        this.nombre = nombre;
    }

    // Método específico del sistema antiguo
    public void jugarTurno() {
        System.out.println(nombre + " (legado) juega su turno.");
    }

    public String obtenerNombre() {
        return nombre;
    }
}