package visitor;

public class Cirurgiao implements Pessoa{

    private int cpf;
    private String nome;
    private String turno;
    private float salario;

    public Cirurgiao(int cpf, String nome, String turno, float salario) {
        this.cpf = cpf;
        this.nome = nome;
        this.turno = turno;
        this.salario = salario;
    }

    public int getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getTurno() {
        return turno;
    }

    public float getSalario() {
        return salario;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirCirurgiao(this);
    }
}
