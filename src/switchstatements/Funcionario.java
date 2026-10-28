package switchstatements;

// Refatorado: Replace Conditional with Polymorphism
public abstract class Funcionario {
    private final String nome;
    protected final double salarioBase;

    protected Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public abstract double calcularSalario();

    public abstract double calcularBonus();
}
