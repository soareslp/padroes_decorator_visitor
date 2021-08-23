package visitor;

public class Cliente implements Pessoa{

    private int cpf;
    private String nome;
    private Animal animal;

    public Cliente(int cpf, String nome, Animal animal) {
        this.cpf = cpf;
        this.nome = nome;
        this.animal = animal;
    }

    public int getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeAnimal() {
        return animal.getNomeAnimal();
    }

    public String getRacaAnimal() {
        return animal.getRacaAnimal();
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirCliente(this);
    }
}
