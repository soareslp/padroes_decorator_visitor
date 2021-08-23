package decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CargoTest {

    @Test
    void deveRetornarSalarioVeterinario() {
        Cargo cargo = new CargoVeterinario(3000.0f);

        assertEquals(3000.0f, cargo.getSalario());
    }

    @Test
    void deveRetornarSalarioVeterinarioComTecnico() {
        Cargo cargo = new Tecnico(new CargoVeterinario(3000.0f));

        assertEquals(3300.0f, cargo.getSalario());
    }

    @Test
    void deveRetornarSalarioVeterinarioComMestrado() {
        Cargo cargo = new Mestrado(new CargoVeterinario(3000.0f));

        assertEquals(3600.0002f, cargo.getSalario());
    }

    @Test
    void deveRetornarSalarioVeterinarioComDoutorado() {
        Cargo cargo = new Doutorado(new CargoVeterinario(3000.0f));

        assertEquals(3899.9998f, cargo.getSalario());
    }

    @Test
    void deveRetornarSalarioVeterinarioComEspecializacao() {
        Cargo cargo = new Especializacao(new CargoVeterinario(3000.0f));

        assertEquals(3450.0f, cargo.getSalario());
    }

    @Test
    void deveRetornarSalarioVeterinarioComTecnicoEMestrado(){
        Cargo cargo = new Mestrado(new Tecnico(new CargoVeterinario(3000.0f)));

        assertEquals(3960.0002f, cargo.getSalario());
    }

    @Test
    void deveRetornarSalarioVeterinarioComTecnicoEDoutorado(){
        Cargo cargo = new Doutorado(new Tecnico(new CargoVeterinario(3000.0f)));

        assertEquals(4290.0f, cargo.getSalario());
    }

    @Test
    void deveRetornarSalarioVeterinarioComTecnicoEEspecializacao(){
        Cargo cargo = new Especializacao(new Tecnico(new CargoVeterinario(3000.0f)));

        assertEquals(3795.0f, cargo.getSalario());
    }

    @Test
    void deveRetornarSalarioVeterinarioComMestradoEDoutorado(){
        Cargo cargo = new Doutorado(new Mestrado(new CargoVeterinario(3000.0f)));

        assertEquals(4680.0f, cargo.getSalario());
    }

    @Test
    void deveRetornarSalarioVeterinarioComMestradoEEspecializacao(){
        Cargo cargo = new Especializacao(new Mestrado(new CargoVeterinario(3000.0f)));

        assertEquals(4140.0f, cargo.getSalario());
    }

    @Test
    void deveRetornarSalarioVeterinarioComDoutoradoEEspecializacao(){
        Cargo cargo = new Doutorado(new Especializacao(new CargoVeterinario(3000.0f)));

        assertEquals(4485.0f, cargo.getSalario());
    }

    @Test
    void deveRetornarSalarioVeterinarioComTecnicoEEspecializacaoEMestrado(){
        Cargo cargo = new Especializacao(new Mestrado(new Tecnico(new CargoVeterinario(3000.0f))));

        assertEquals(4554.0f, cargo.getSalario());
    }

    @Test
    void deveRetornarSalarioVeterinarioComTecnicoEMestradoEDoutorado(){
        Cargo cargo = new Doutorado(new Mestrado(new Tecnico(new CargoVeterinario(3000.0f))));

        assertEquals(5148.0f, cargo.getSalario());
    }

    @Test
    void deveRetornarSalarioVeterinarioComMestradoEEspecializacaoEDoutorado(){
        Cargo cargo = new Doutorado(new Especializacao(new Mestrado(new CargoVeterinario(3000.0f))));

        assertEquals(5382.0f, cargo.getSalario());
    }

    @Test
    void deveRetornarSalarioVeterinarioComTecnicoEEspecializacaoEDoutorado(){
        Cargo cargo = new Doutorado(new Especializacao(new Tecnico(new CargoVeterinario(3000.0f))));

        assertEquals(4933.5f, cargo.getSalario());
    }

    @Test
    void deveRetornarSalarioVeterinarioComTecnicoEMestradoEEspecializacaoEDoutorado(){
        Cargo cargo = new Doutorado(new Especializacao(new Mestrado(new Tecnico(new CargoVeterinario(3000.0f)))));

        assertEquals(5920.1997f, cargo.getSalario());
    }

    @Test
    void deveRetornarEstruturaCargo() {
        Cargo cargo = new CargoVeterinario();

        assertEquals("Veterinário", cargo.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaCargoComTecnico() {
        Cargo cargo = new Tecnico(new CargoVeterinario());

        assertEquals("Veterinário/Técnico", cargo.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaCargoComMestrado() {
        Cargo cargo = new Mestrado(new CargoVeterinario());

        assertEquals("Veterinário/Mestrado", cargo.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaCargoComEspecializacao() {
        Cargo cargo = new Especializacao(new CargoVeterinario());

        assertEquals("Veterinário/Especialização", cargo.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaCargoComDoutorado() {
        Cargo cargo = new Doutorado(new CargoVeterinario());

        assertEquals("Veterinário/Doutorado", cargo.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaVeterinarioComTecnicoEMestrado(){
        Cargo cargo = new Mestrado(new Tecnico(new CargoVeterinario()));

        assertEquals("Veterinário/Técnico/Mestrado", cargo.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaVeterinarioComTecnicoEEspecializacao(){
        Cargo cargo = new Especializacao(new Tecnico(new CargoVeterinario()));

        assertEquals("Veterinário/Técnico/Especialização", cargo.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaVeterinarioComTecnicoEDoutorado(){
        Cargo cargo = new Doutorado(new Tecnico(new CargoVeterinario()));

        assertEquals("Veterinário/Técnico/Doutorado", cargo.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaVeterinarioComMestradoEEspecializacao(){
        Cargo cargo = new Especializacao(new Mestrado(new CargoVeterinario()));

        assertEquals("Veterinário/Mestrado/Especialização", cargo.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaVeterinarioComMestradoEDoutorado(){
        Cargo cargo = new Doutorado(new Mestrado(new CargoVeterinario()));

        assertEquals("Veterinário/Mestrado/Doutorado", cargo.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaVeterinarioComEspecializacaoEDoutorado(){
        Cargo cargo = new Doutorado(new Especializacao(new CargoVeterinario()));

        assertEquals("Veterinário/Especialização/Doutorado", cargo.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaVeterinarioComTecnicoEMestradoEEspecializacao(){
        Cargo cargo = new Especializacao(new Mestrado(new Tecnico(new CargoVeterinario())));

        assertEquals("Veterinário/Técnico/Mestrado/Especialização", cargo.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaVeterinarioComTecnicoEMestradoEDoutorado(){
        Cargo cargo = new Doutorado(new Mestrado(new Tecnico(new CargoVeterinario())));

        assertEquals("Veterinário/Técnico/Mestrado/Doutorado", cargo.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaVeterinarioComMestradoEEspecializacaoEDoutorado(){
        Cargo cargo = new Doutorado(new Especializacao(new Mestrado(new CargoVeterinario())));

        assertEquals("Veterinário/Mestrado/Especialização/Doutorado", cargo.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaVeterinarioComTecnicoEEspecializacaoEDoutorado(){
        Cargo cargo = new Doutorado(new Especializacao(new Tecnico(new CargoVeterinario())));

        assertEquals("Veterinário/Técnico/Especialização/Doutorado", cargo.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaVeterinarioComTecnicoEMestradoEEspecializacaoEDoutorado(){
        Cargo cargo = new Doutorado(new Especializacao (new Mestrado(new Tecnico(new CargoVeterinario()))));

        assertEquals("Veterinário/Técnico/Mestrado/Especialização/Doutorado", cargo.getEstrutura());
    }

}