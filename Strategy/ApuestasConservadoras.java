package strategy;

// Estrategia que apuesta un pequeño porcentaje de las fichas
public class ApuestasConservadoras implements EstrategiaApuestas {
    @Override
    public int calcularApuesta(int fichasDisponibles) {
        return Math.max(10, fichasDisponibles / 20); // 5% o mínimo 10
    }
}