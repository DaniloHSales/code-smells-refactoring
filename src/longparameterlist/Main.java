package longparameterlist;

public class Main {
    public static void main(String[] args) {
        FreteService service = new FreteService();
        // Qual número é peso? Qual é altura? Fácil trocar a ordem sem perceber.
        double frete = service.calcular("58400-000", 2.5, 10, 20, 30, "EXPRESSO", true, 150.0);
        System.out.printf("Frete: R$ %.2f%n", frete);
    }
}
