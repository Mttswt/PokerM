package dominio;

import java.util.ArrayList;
import java.util.List;
//Clase que simula la mano que tendra un jugador en cada ronda
public class Mano {
    private final List<Carta> cartas;
    private TipoMano tipoMano;

    public Mano() {
        this.cartas = new ArrayList<>();
    }
    
    //Agrega una carta a la mano del jugador
    public void agregarCarta(Carta carta) {
        if (cartas.size() < 5) {
            cartas.add(carta);
        }
    }

    //Obtiene las cartas de la mano
    public List<Carta> getCartas() {
        return cartas;
    }
    
    //retorna el tipo de mano que consiguio el jugador al final
    public TipoMano getTipoMano() {
        return tipoMano;
    }
    
    //se le da el valor al tipo de mano del jugador
    public void setTipoMano(TipoMano tipoMano) {
        this.tipoMano = tipoMano;
    }

    @Override
    public String toString() {
        return cartas.toString() + " (" + tipoMano + ")";
    }
}