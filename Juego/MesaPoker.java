package juego;

import java.util.ArrayList;
import java.util.List;

// Mesa de juego que contiene asientos para los jugadores
public class MesaPoker {
    private List<Asiento> asientos;

    public MesaPoker(int cantidadAsientos) {
        asientos = new ArrayList<>();
        for (int i = 1; i <= cantidadAsientos; i++) {
            asientos.add(new Asiento(i));
        }
    }

    public List<Asiento> getAsientos() {
        return asientos;
    }

    public boolean sentarJugador(JugadorBasico jugador) {
        for (Asiento asiento : asientos) {
            if (!asiento.estaOcupado()) {
                asiento.asignarJugador(jugador);
                return true;
            }
        }
        return false; // no hay lugar
    }

    public void mostrarJugadores() {
        for (Asiento asiento : asientos) {
            String nombre = asiento.estaOcupado() ? asiento.getJugador().getNombre() : "VACÍO";
            System.out.println("Asiento " + asiento.getNumero() + ": " + nombre);
        }
    }
}
