package decorator;

public abstract class CargoDecorator implements Cargo {

    private Cargo cargo;
    public String estrutura;

    public CargoDecorator(Cargo cargo) {
        this.cargo = cargo;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public abstract float getPercentualSalario();

    public float getSalario() {
        return this.cargo.getSalario() * (1 + (this.getPercentualSalario() / 100));
    }

    public abstract String getNomeEstrutura();

    public String getEstrutura() {
        return this.cargo.getEstrutura() + "/" + this.getNomeEstrutura();
    }

    public void setEstrutura(String estrutura)   {
        this.estrutura = estrutura;
    }
}
