package strategy;

// Estrategia que apuesta una parte grande de las fichas
public class ApuestasAgresivas implements EstrategiaApuestas {
    @Override
    public int calcularApuesta(int fichasDisponibles) {
        return Math.max(50, fichasDisponibles / 3); // 33% o mínimo 50
    }
}