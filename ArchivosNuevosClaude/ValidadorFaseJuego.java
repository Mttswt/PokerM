/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NuevosA4;

public class ValidadorFaseJuego extends ValidadorApuesta {
    private Set<String> fasesValidasParaApuesta = 
        Set.of("Pre-Flop", "Flop", "Turn", "River");
    
    @Override
    protected boolean puedeValidar(ContextoApuesta contexto) {
        return contexto.getFaseJuego() != null;
    }
    
    @Override
    protected void ejecutarValidacion(ContextoApuesta contexto) {
        if (!fasesValidasParaApuesta.contains(contexto.getFaseJuego())) {
            contexto.agregarError("No se pueden hacer apuestas en la fase: " + 
                contexto.getFaseJuego());
        }
    }
    
    @Override
    protected String getNombre() { return "ValidadorFaseJuego"; }
}
