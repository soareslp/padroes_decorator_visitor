package visitor;

public class Atendente implements Pessoa {

    private int cpf;
    private String nome;
    private float salario;

    public Atendente(int cpf, String nome, float salario) {
        this.cpf = cpf;
        this.nome = nome;
        this.salario = salario;
    }

    public int getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public float getSalario() {
        return salario;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirAtendente(this);
    }
}
