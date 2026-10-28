package comments;

import java.util.List;

public class Fatura {

    // lista com os preços dos itens
    private final List<Double> l;

    // tipo do cliente: 1 = VIP, 2 = comum
    private final int t;

    public Fatura(List<Double> l, int t) {
        this.l = l;
        this.t = t;
    }

    // CODE SMELL: Comments - comentários explicando código confuso
    // calcula o valor final da fatura
    public double calc() {
        // soma o preço de todos os itens
        double s = 0;
        for (double v : l) {
            s += v;
        }

        // cliente VIP recebe 10% de desconto
        if (t == 1) {
            s = s - (s * 0.10);
        }

        // se o total passar de 1000 reais, cobra 2% de taxa administrativa
        if (s > 1000) {
            s = s + (s * 0.02);
        }

        // retorna o resultado
        return s;
    }
}
