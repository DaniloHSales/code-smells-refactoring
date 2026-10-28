package longparameterlist;

// Parameter Object: agrupa dados que sempre andam juntos
public record Pacote(double pesoKg, double alturaCm, double larguraCm, double comprimentoCm) {

    public double volumeCm3() {
        return alturaCm * larguraCm * comprimentoCm;
    }
}
