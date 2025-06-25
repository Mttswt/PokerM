/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NuevosA4;
public class ValidadorFichasSuficientes extends ValidadorApuesta {
    @Override
    protected boolean puedeValidar(ContextoApuesta contexto) {
        return contexto.getCantidad() > 0;
    }
    
    @Override
    protected void ejecutarValidacion(ContextoApuesta contexto) {
        if (contexto.getCantidad() > contexto.getFichasDisponibles()) {
            contexto.agregarError("Fichas insuficientes: tiene " + 
                contexto.getFichasDisponibles() + ", quiere apostar " + 
                contexto.getCantidad());
        }
    }
    
    @Override
    protected String getNombre() { return "ValidadorFichasSuficientes"; }
}

public class ValidadorApuestaMinima extends ValidadorApuesta {
    @Override
    protected boolean puedeValidar(ContextoApuesta contexto) {
        return contexto.getApuestaMinima() > 0;
    }
    
    @Override
    protected void ejecutarValidacion(ContextoApuesta contexto) {
        if (contexto.getCantidad() < contexto.getApuestaMinima()) {
            contexto.agregarError("Apuesta muy baja: mínimo " + 
                contexto.getApuestaMinima() + ", propuesta " + 
                contexto.getCantidad());
        }
    }
    
    @Override
    protected String getNombre() { return "ValidadorApuestaMinima"; }
}

