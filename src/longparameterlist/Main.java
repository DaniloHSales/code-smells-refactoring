package longparameterlist;

public class Main {
    public static void main(String[] args) {
        FreteService service = new FreteService();

        Pacote pacote = new Pacote(2.5, 10, 20, 30);
        OpcoesEnvio opcoes = new OpcoesEnvio("EXPRESSO", true, 150.0);

        double frete = service.calcular("58400-000", pacote, opcoes);
        System.out.printf("Frete: R$ %.2f%n", frete);
    }
}
