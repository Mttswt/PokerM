/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nuevosA2;

public abstract class PrototipoMano implements Cloneable {
    protected Mano manoBase;
    protected String nombre;
    
    public abstract Mano crearMano();
    
    @Override
    public PrototipoMano clone() {
        try {
            PrototipoMano clon = (PrototipoMano) super.clone();
            clon.manoBase = new Mano();
            // Clonar cartas individualmente
            for (Carta carta : this.manoBase.getCartas()) {
                clon.manoBase.agregarCarta(new Carta(carta.getPalo(), carta.getValor()));
            }
            return clon;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Error al clonar mano", e);
        }
    }
    
    public String getNombre() { return nombre; }
}