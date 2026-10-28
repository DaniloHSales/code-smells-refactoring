package longparameterlist;

// Parameter Object: agrupa as opções escolhidas pelo cliente
public record OpcoesEnvio(String tipoEntrega, boolean seguro, double valorDeclarado) {
}
