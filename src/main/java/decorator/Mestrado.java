package decorator;

public class Mestrado extends CargoDecorator{

    public Mestrado (Cargo cargo) {
        super(cargo);
    }

    @Override
    public float getPercentualSalario() {
        return 20.0f;
    }

    @Override
    public String getNomeEstrutura() {
        return "Mestrado";
    }
}
