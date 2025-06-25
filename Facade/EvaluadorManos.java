package facade;

import dominio.Mano;
import dominio.TipoMano;

// Evalúa el tipo de mano del jugador
public class EvaluadorManos {
    public TipoMano evaluar(Mano mano) {
        
        if (mano.getCartas().size() == 5) {
            return TipoMano.CARTA_ALTA;
        }
        return null;
    }
}