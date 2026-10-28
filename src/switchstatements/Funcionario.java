package switchstatements;

public class Funcionario {
    private final String nome;
    private final String cargo;
    private final double salarioBase;

    public Funcionario(String nome, String cargo, double salarioBase) {
        this.nome = nome;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    // CODE SMELL: Switch Statements
    public double calcularSalario() {
        switch (cargo) {
            case "GERENTE":
                return salarioBase * 1.5;
            case "DESENVOLVEDOR":
                return salarioBase * 1.2;
            case "ESTAGIARIO":
                return salarioBase;
            default:
                throw new IllegalArgumentException("Cargo inválido: " + cargo);
        }
    }

    // O MESMO switch repetido em outro método
    public double calcularBonus() {
        switch (cargo) {
            case "GERENTE":
                return salarioBase * 0.30;
            case "DESENVOLVEDOR":
                return salarioBase * 0.10;
            case "ESTAGIARIO":
                return 0;
            default:
                throw new IllegalArgumentException("Cargo inválido: " + cargo);
        }
    }
}
