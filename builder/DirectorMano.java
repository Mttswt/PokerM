package builder;

// Director que usa el constructor para armar una mano
public class DirectorMano {
    public ConstructorMano constructor;

    public DirectorMano(ConstructorMano constructor) {
        this.constructor = constructor;
    }

    public void construirManoAleatoria() {
        constructor.construirManoCompleta();
    }
}