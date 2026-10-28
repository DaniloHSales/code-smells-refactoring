package longparameterlist;

public class FreteService {

    // Refatorado: Introduce Parameter Object (de 8 para 3 parâmetros)
    public double calcular(String cepDestino, Pacote pacote, OpcoesEnvio opcoes) {
        double base = Math.max(pacote.pesoKg(), pacote.volumeCm3() / 6000.0) * 5.0;

        if (opcoes.tipoEntrega().equals("EXPRESSO")) {
            base *= 1.8;
        }
        if (cepDestino.startsWith("58")) {
            base *= 0.9;
        }
        if (opcoes.seguro()) {
            base += opcoes.valorDeclarado() * 0.01;
        }
        return base;
    }
}
