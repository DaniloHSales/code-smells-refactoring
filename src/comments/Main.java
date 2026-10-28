package comments;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Fatura fatura = new Fatura(List.of(500.0, 450.0, 200.0), TipoCliente.VIP);
        System.out.printf("Total: R$ %.2f%n", fatura.calcularValorFinal());
    }
}
