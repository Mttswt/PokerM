
package nuevosA2;

public class ConstructorManoFluido {
    private Mano mano;
    private FabricaCartasJuego fabrica;
    
    private ConstructorManoFluido(FabricaCartasJuego fabrica) {
        this.fabrica = fabrica;
        this.mano = new Mano();
    }
    
    public static ConstructorManoFluido crear(FabricaCartasJuego fabrica) {
        return new ConstructorManoFluido(fabrica);
    }
    
    public ConstructorManoFluido conCarta(Palo palo, Valor valor) {
        mano.agregarCarta(new Carta(palo, valor));
        return this;
    }
    
    public ConstructorManoFluido conCartasAleatorias(int cantidad) {
        List<Carta> baraja = fabrica.crearBaraja();
        Collections.shuffle(baraja);
        for (int i = 0; i < Math.min(cantidad, 5); i++) {
            mano.agregarCarta(baraja.get(i));
        }
        return this;
    }
    
    public ConstructorManoFluido conPareja(Valor valor) {
        mano.agregarCarta(new Carta(Palo.CORAZONES, valor));
        mano.agregarCarta(new Carta(Palo.PICAS, valor));
        return this;
    }
    
    public ConstructorManoFluido conTrio(Valor valor) {
        mano.agregarCarta(new Carta(Palo.CORAZONES, valor));
        mano.agregarCarta(new Carta(Palo.PICAS, valor));
        mano.agregarCarta(new Carta(Palo.DIAMANTES, valor));
        return this;
    }
    
    public ConstructorManoFluido conColor(Palo palo) {
        for (int i = 0; i < 5 && i < Valor.values().length; i++) {
            mano.agregarCarta(new Carta(palo, Valor.values()[i]));
        }
        return this;
    }
    
    public Mano construir() {
        return mano;
    }
}
