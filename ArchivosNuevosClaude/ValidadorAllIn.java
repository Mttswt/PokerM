/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NuevosA4;

public class ValidadorAllIn extends ValidadorApuesta {
    @Override
    protected boolean puedeValidar(ContextoApuesta contexto) {
        return contexto.getCantidad() == contexto.getFichasDisponibles();
    }
    
    @Override
    protected voi