package decorator;

public class CargoVeterinario implements Cargo{

    public float salario;

    public CargoVeterinario() {
    }

    public CargoVeterinario(float salario) {
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public String getEstrutura() {
        return "Veterinário";
    }
}
