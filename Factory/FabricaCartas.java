package factory;


import dominio.Baraja;
import dominio.Carta;
import java.util.List;
//Fabrica abstracta que define el metodo para crear una baraja en el juego
public abstract class FabricaCartas {
    public abstract List<Carta> crearBaraja();
}
