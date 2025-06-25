/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NuevosA4;
public class ValidadorJugadorActivo extends ValidadorApuesta {
    private Set<String> jugadoresRetirados;
    
    public ValidadorJugadorActivo(Set<String> jugadoresRetirados) {
        this.jugadoresRetirados = jugadoresRetirados != null ? 
            jugadoresRetirados : new HashSet<>();
    }
    
    @Override
    protected boolean puedeValidar(ContextoApuesta contexto) {
        return contexto.getJugador() != null;
    }
    
    @Override
    protected void ejecutarValidacion(ContextoApuesta contexto) {
        if (jugadoresRetirados.contains(contexto.getJugador())) {
            contexto.agregarError("El jugador " + contexto.getJugador() + 
                " ya se retiró de esta ronda");
        }
    }
    
    @Override
    protected String getNombre() { return "ValidadorJugadorActivo"; }
}
