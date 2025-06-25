package factory;


import dominio.Baraja;
import dominio.Carta;
import dominio.Palo;
import dominio.Valor;
import java.util.ArrayList;
import java.util.List;

public class FabricaCartasJuego extends FabricaCartas {

    @Override
    public List<Carta> crearBaraja() {
        List<Carta> baraja = new ArrayList<>();
        for (Palo palo : Palo.values()) {
            for (Valor valor : Valor.values()) {
                baraja.add(new Carta(palo, valor));
            }
        }
        return baraja;
    }
}