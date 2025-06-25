package dominio;
//clase que representa la cantidad apostada en un juego de poker
public class Bote {
    private int total;

    public Bote() {
        this.total = 0;
    }
    //metodo para agregar mas fichas a la cantidad de fichas apostadas
    public void agregarFichas(int cantidad) {
        if (cantidad > 0) {
            total += cantidad;
        }
    }
    //retorna la apuesta total realizada
    public int getTotal() {
        return total;
    }
    //metodo para retirar todo el dinero apostado
    public int retirarTodo() {
        int fichas = total;
        total = 0;
        return fichas;
    }
}