/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;

import java.util.HashMap;
import java.util.Map;

// Observador que lleva un marcador (fichas ganadas)
public class ObservadorMarcador implements ObservadorEventosJuego {
    private final Map<String, Integer> marcador;

    public ObservadorMarcador() {
        marcador = new HashMap<>();
    }

    @Override
    public void actualizar(String evento, Object data) {
        if (evento.equals("GANADOR")) {
            String jugador = (String) data;
            marcador.put(jugador, marcador.getOrDefault(jugador, 0) + 1);
        }
    }

    public int getVictorias(String jugador) {
        return marcador.getOrDefault(jugador, 0);
    }
}
