package decorator;

public class Tecnico extends CargoDecorator{

    public Tecnico (Cargo cargo) {
        super(cargo);
    }

    @Override
    public float getPercentualSalario() {
        return 10.0f;
    }

    @Override
    public String getNomeEstrutura() {
        return "Técnico";
    }
}
