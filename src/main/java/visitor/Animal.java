package visitor;

public class Animal {

    private String nomeAnimal;
    private String racaAnimal;

    public Animal(String nomeAnimal, String racaAnimal) {
        this.nomeAnimal = nomeAnimal;
        this.racaAnimal = racaAnimal;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public String getRacaAnimal() {
        return racaAnimal;
    }
}
