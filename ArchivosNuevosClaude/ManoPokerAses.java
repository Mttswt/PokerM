/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nuevosA2;

public class ManoPokerAses extends PrototipoMano {
    public ManoPokerAses() {
        this.nombre = "Poker de Ases";
        this.manoBase = ConstructorManoFluido.crear(new FabricaCartasJuego())
            .conCarta(Palo.CORAZONES, Valor.AS)
            .conCarta(Palo.PICAS, Valor.AS)
            .conCarta(Palo.DIAMANTES, Valor.AS)
            .conCarta(Palo.TREBOLES, Valor.AS)
            .conCarta(Palo.CORAZONES, Valor.K)
            .construir();
    }
    
    @Override
    public Mano crearMano() {
        return this.clone().manoBase;
    }
}