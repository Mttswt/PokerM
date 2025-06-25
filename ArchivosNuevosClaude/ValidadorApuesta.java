/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NuevosA4;

public abstract class ValidadorApuesta {
    protected ValidadorApuesta siguienteValidador;
    
    public void setSiguiente(ValidadorApuesta siguiente) {
        this.siguienteValidador = siguiente;
    }
    
    public void validar(ContextoApuesta contexto) {
        if (puedeValidar(contexto)) {
            ejecutarValidacion(contexto);
        }
        
        // Continuar con el siguiente validador
        if (siguienteValidador != null) {
            siguienteValidador.validar(contexto);
        }
    }
    
    protected abstract boolean puedeValidar(ContextoApuesta contexto);
    protected abstract void ejecutarValidacion(ContextoApuesta contexto);
    protected abstract String getNombre();
}
