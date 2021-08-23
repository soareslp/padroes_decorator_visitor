package decorator;

public class Especializacao extends CargoDecorator{

    public Especializacao (Cargo cargo) {
        super(cargo);
    }

    @Override
    public float getPercentualSalario() {
        return 15.0f;
    }

    @Override
    public String getNomeEstrutura() {
        return "Especialização";
    }
}
