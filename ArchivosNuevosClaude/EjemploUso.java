
package nuevosA2;

 
public class EjemploUso {
    public void demostrarUso() {
        FabricaCartasJuego fabrica = new FabricaCartasJuego();
        
        // Builder fluido para manos personalizadas
        Mano manoCustom = ConstructorManoFluido.crear(fabrica)
            .conPareja(Valor.AS)
            .conCarta(Palo.CORAZONES, Valor.K)
            .construir();
            
        // Prototype para manos predefinidas
        RegistroPrototiposMano registro = new RegistroPrototiposMano();
        Mano escaleraReal = registro.crearMano("escalera_real");
        
        System.out.println("Mano custom: " + manoCustom);
        System.out.println("Escalera real: " + escaleraReal);
    }
}