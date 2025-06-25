package dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//Clase que simula la baraja en un juego de poker
public class Baraja {
    private final List<Carta> cartas;

    public Baraja() {
        cartas = new ArrayList<>();
        for (Palo palo : Palo.values()) {
            for (Valor valor : Valor.values()) {
                cartas.add(new Carta(palo, valor));
            }
        }
        mezclar();
    }
    //Metodo para mezclar las cartas y ponerlas en orden aleatorio
    public void mezclar() {
        Collections.shuffle(cartas);
    }
    //Se reparte una carla y se elimina de la baraja actual
    public Carta repartir() {
        return cartas.isEmpty() ? null : cartas.remove(0);
    }
    //Retorna las cartas restantes de la baraja
    public int cartasRestantes() {
        return cartas.size();
    }
}