/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

// Construye una mano de cartas aleatorias

import dominio.Carta;
import factory.FabricaCartasJuego;
import java.util.Collections;
import java.util.List;

public class ConstructorManoAleatoria extends ConstructorMano {
    private FabricaCartasJuego fabrica;

    public ConstructorManoAleatoria(FabricaCartasJuego fabrica) {
        super(fabrica);
        this.fabrica = fabrica;
    }

    @Override
    public void agregarCarta(Carta carta) {
        if (mano != null) {
            mano.agregarCarta(carta);
        }
    }

    @Override
    public void construirManoCompleta() {
        crearNuevaMano();
        List<Carta> baraja = fabrica.crearBaraja();
        Collections.shuffle(baraja);

        for (int i = 0; i < 5; i++) {
            agregarCarta(baraja.get(i));
        }
    }
}
