# Code Smells e Refactorings (Java)

Atividade em grupo: exemplos de code smells e as refatorações aplicadas.

| Code smell | Pacote | Refactoring aplicado |
|---|---|---|
| Long Parameter List | `src/longparameterlist` | Introduce Parameter Object |
| Switch Statements | `src/switchstatements` | Replace Conditional with Polymorphism |
| Comments | `src/comments` | Rename, Extract Method, Replace Magic Number with Constant |

## Onde estão os códigos

- **Código original (com os smells):** branch `main`.
- **Código refatorado:** branch `refactoring` (um commit por code smell), apresentado no Pull Request.

## Como compilar e executar

```bash
javac -d out $(find src -name "*.java")
java -cp out longparameterlist.Main
java -cp out switchstatements.Main
java -cp out comments.Main
```

Requer Java 17 ou superior.
