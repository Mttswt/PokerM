/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nuevosA2;

public class RegistroPrototiposMano {
    private Map<String, PrototipoMano> prototipos = new HashMap<>();
    
    public RegistroPrototiposMano() {
        prototipos.put("escalera_real", new ManoEscaleraReal());
        prototipos.put("poker_ases", new ManoPokerAses());
    }
    
    public Mano crearMano(String tipo) {
        PrototipoMano prototipo = prototipos.get(tipo);
        return prototipo != null ? prototipo.crearMano() : null;
    }
    
    public void registrarPrototipo(String nombre, PrototipoMano prototipo) {
        prototipos.put(nombre, prototipo);
    }
}
