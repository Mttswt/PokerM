package strategy;

import juego.Jugador;

// Jugador que usa una estrategia de apuestas
public class JugadorIA implements Jugador {
    private String nombre;
    private EstrategiaApuestas estrategia;

    public JugadorIA(String nombre, EstrategiaApuestas estrategia) {
        this.nombre = nombre;
        this.estrategia = estrategia;
    }

    @Override
    public void jugar() {
        System.out.println(nombre + " está pensando su jugada...");
        // Aquí solo demostrativo; en integración se usaría con FachadaJuegoPoker
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    // Ejecuta la estrategia actual para decidir cuánto apostar
    public int decidirApuesta(int fichasDisponibles) {
        return estrategia.calcularApuesta(fichasDisponibles);
    }

    // Permite cambiar la estrategia en tiempo de ejecución
    public void setEstrategia(EstrategiaApuestas nuevaEstrategia) {
        this.estrategia = nuevaEstrategia;
    }
}
