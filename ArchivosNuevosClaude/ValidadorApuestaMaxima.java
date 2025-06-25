/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NuevosA4;
public class ValidadorApuestaMaxima extends ValidadorApuesta {
    @Override
    protected boolean puedeValidar(ContextoApuesta contexto) {
        return contexto.getApuestaMaxima() > 0;
    }
    
    @Override
    protected void ejecutarValidacion(ContextoApuesta contexto) {
        if (contexto.getCantidad() > contexto.getApuestaMaxima()) {
            contexto.agregarError("Apuesta muy alta: máximo " + 
                contexto.getApuestaMaxima() + ", propuesta " + 
                contexto.getCantidad());
        }
    }
    
    @Override
    protected String getNombre() { return "ValidadorApuestaMaxima"; }
}
