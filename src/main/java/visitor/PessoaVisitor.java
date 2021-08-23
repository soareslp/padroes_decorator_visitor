package visitor;

public class PessoaVisitor implements Visitor {

    public String exibir(Pessoa pessoa) {
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirCliente(Cliente cliente) {
        return "Cliente{" +
                "cpf=" + cliente.getCpf() +
                ", nome='" + cliente.getNome() + '\'' +
                ", nome animal='" + cliente.getNomeAnimal() + '\'' +
                ", raca animal='" + cliente.getRacaAnimal() + '\'' +
                '}';
    }

    @Override
    public String exibirVeterinario(Veterinario veterinario) {
        return "Veterinario{" +
                "cpf=" + veterinario.getCpf() +
                ", nome='" + veterinario.getNome() + '\'' +
                ", turno='" + veterinario.getTurno() + '\'' +
                '}';
    }

    @Override
    public String exibirAtendente(Atendente atendente) {
        return "Atendente{" +
                "cpf=" + atendente.getCpf() +
                ", nome='" + atendente.getNome() + '\'' +
                ", salario=" + atendente.getSalario() +
                '}';
    }

    @Override
    public String exibirCirurgiao(Cirurgiao cirurgiao) {
        return "Cirurgiao{" +
                "cpf=" + cirurgiao.getCpf() +
                ", nome='" + cirurgiao.getNome() + '\'' +
                ", turno='" + cirurgiao.getTurno() + '\'' +
                ", salario=" + cirurgiao.getSalario() +
                '}';
    }
}
