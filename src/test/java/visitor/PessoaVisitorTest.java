package visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaVisitorTest {

    @Test
    void deveExibirCliente() {
        Cliente cliente = new Cliente(1, "Lucas", new Animal("Lunna", "Pug"));

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Cliente{cpf=1, nome='Lucas', nome animal='Lunna', raca animal='Pug'}", visitor.exibir(cliente));
    }

    @Test
    void deveExibirVeterinario() {
        Veterinario veterinario = new Veterinario(1, "Diogo", "Noturno");

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Veterinario{cpf=1, nome='Diogo', turno='Noturno'}", visitor.exibir(veterinario));
    }

    @Test
    void deveExibirAtendente() {
        Atendente atendente = new Atendente(1, "Guilherme", 3000.0f);

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Atendente{cpf=1, nome='Guilherme', salario=3000.0}", visitor.exibir(atendente));
    }

    @Test
    void deveExibirCirurgiao() {
        Cirurgiao cirurgiao = new Cirurgiao(1, "Henrique", "Diurno", 3000.0f);

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Cirurgiao{cpf=1, nome='Henrique', turno='Diurno', salario=3000.0}", visitor.exibir(cirurgiao));
    }

}