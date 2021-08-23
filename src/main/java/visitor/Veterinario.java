package visitor;

public class Veterinario implements Pessoa{

    private int cpf;
    private String nome;
    private String turno;

    public Veterinario(int cpf, String nome, String turno) {
        this.cpf = cpf;
        this.nome = nome;
        this.turno = turno;
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

    public String aceitar(Visitor visitor) {
        return visitor.exibirVeterinario(this);
    }
}
