/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NuevosA4;
public class ContextoApuesta {
    private String jugador;
    private int cantidad;
    private int fichasDisponibles;
    private int apuestaMinima;
    private int apuestaMaxima;
    private String faseJuego;
    private List<String> errores;
    
    public ContextoApuesta(String jugador, int cantidad, int fichasDisponibles, 
                          int apuestaMinima, int apuestaMaxima, String faseJuego) {
        this.jugador = jugador;
        this.cantidad = cantidad;
        this.fichasDisponibles = fichasDisponibles;
        this.apuestaMinima = apuestaMinima;
        this.apuestaMaxima = apuestaMaxima;
        this.faseJuego = faseJuego;
        this.errores = new ArrayList<>();
    }
    
    // Getters y setters
    public String getJugador() { return jugador; }
    public int getCantidad() { return cantidad; }
    public int getFichasDisponibles() { return fichasDisponibles; }
    public int getApuestaMinima() { return apuestaMinima; }
    public int getApuestaMaxima() { return apuestaMaxima; }
    public String getFaseJuego() { return faseJuego; }
    public List<String> getErrores() { return errores; }
    
    public void agregarError(String error) {
        errores.add(error);
    }
    
    public boolean esValida() {
        return errores.isEmpty();
    }
}
