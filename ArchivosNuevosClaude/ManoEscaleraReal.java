/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nuevosA2;

public class ManoEscaleraReal extends PrototipoMano {
    public ManoEscaleraReal() {
        this.nombre = "Escalera Real";
        this.manoBase = ConstructorManoFluido.crear(new FabricaCartasJuego())
            .conCarta(Palo.CORAZONES, Valor.DIEZ)
            .conCarta(Palo.CORAZONES, Valor.J)
            .conCarta(Palo.CORAZONES, Valor.Q)
            .conCarta(Palo.CORAZONES, Valor.K)
            .conCarta(Palo.CORAZONES, Valor.AS)
            .construir();
    }
    
    @Override
    public Mano crearMano() {
        return this.clone().manoBase;
    }
}
