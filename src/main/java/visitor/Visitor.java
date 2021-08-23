package visitor;

public interface Visitor {

    String exibirCliente(Cliente cliente);
    String exibirVeterinario(Veterinario veterinario);
    String exibirAtendente(Atendente atendente);
    String exibirCirurgiao(Cirurgiao cirurgiao);
}
