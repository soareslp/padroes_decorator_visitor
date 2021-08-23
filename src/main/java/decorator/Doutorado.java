package decorator;

public class Doutorado extends CargoDecorator{

    public Doutorado (Cargo cargo) {
        super(cargo);
    }

    @Override
    public float getPercentualSalario() {
        return 30.0f;
    }

    @Override
    public String getNomeEstrutura() {
        return "Doutorado";
    }
}
