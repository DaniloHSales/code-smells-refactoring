package longparameterlist;

public class FreteService {

    // CODE SMELL: Long Parameter List (8 parâmetros)
    public double calcular(String cepDestino, double peso, double altura, double largura,
                           double comprimento, String tipoEntrega, boolean seguro,
                           double valorDeclarado) {
        double volume = altura * largura * comprimento;
        double base = Math.max(peso, volume / 6000.0) * 5.0;

        if (tipoEntrega.equals("EXPRESSO")) {
            base *= 1.8;
        }
        if (cepDestino.startsWith("58")) {
            base *= 0.9;
        }
        if (seguro) {
            base += valorDeclarado * 0.01;
        }
        return base;
    }
}
