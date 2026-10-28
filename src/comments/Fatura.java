package comments;

import java.util.List;

// Refatorado: Rename, Extract Method e Replace Magic Number with Constant
public class Fatura {

    private static final double DESCONTO_VIP = 0.10;
    private static final double LIMITE_PARA_TAXA_ADMINISTRATIVA = 1000.0;
    private static final double TAXA_ADMINISTRATIVA = 0.02;

    private final List<Double> precosDosItens;
    private final TipoCliente tipoCliente;

    public Fatura(List<Double> precosDosItens, TipoCliente tipoCliente) {
        this.precosDosItens = precosDosItens;
        this.tipoCliente = tipoCliente;
    }

    public double calcularValorFinal() {
        double total = somarItens();
        total = aplicarDescontoVip(total);
        return aplicarTaxaAdministrativa(total);
    }

    private double somarItens() {
        double soma = 0;
        for (double preco : precosDosItens) {
            soma += preco;
        }
        return soma;
    }

    private double aplicarDescontoVip(double total) {
        if (tipoCliente == TipoCliente.VIP) {
            return total - (total * DESCONTO_VIP);
        }
        return total;
    }

    private double aplicarTaxaAdministrativa(double total) {
        if (total > LIMITE_PARA_TAXA_ADMINISTRATIVA) {
            return total + (total * TAXA_ADMINISTRATIVA);
        }
        return total;
    }
}
