package switchstatements;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> equipe = List.of(
                new Funcionario("Ana", "GERENTE", 5000),
                new Funcionario("Bruno", "DESENVOLVEDOR", 4000),
                new Funcionario("Carla", "ESTAGIARIO", 1500));

        for (Funcionario f : equipe) {
            System.out.printf("%s -> salário: %.2f | bônus: %.2f%n",
                    f.getNome(), f.calcularSalario(), f.calcularBonus());
        }
    }
}
