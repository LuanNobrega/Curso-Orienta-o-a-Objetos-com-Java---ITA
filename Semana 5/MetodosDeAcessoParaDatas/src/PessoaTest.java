import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PessoaTest {

	@Test
    void testeIdadeEASigno() throws ParseException {
        // Define um tempo fixo para os testes
        Relogio.definirTempoFixo(1641049200000L); // 02/01/2022

        // Teste para uma pessoa com data de nascimento em 15/05/1990
        Pessoa pessoa1 = new Pessoa("15/05/1990");
        assertEquals(31, pessoa1.getIdade());
        assertEquals("Touro", pessoa1.getSigno());

        // Teste para uma pessoa com data de nascimento em 03/11/1985
        Pessoa pessoa2 = new Pessoa("03/11/1985");
        assertEquals(36, pessoa2.getIdade());
        assertEquals("Escorpião", pessoa2.getSigno());

        // Teste para uma pessoa com data de nascimento em 25/02/2000
        Pessoa pessoa3 = new Pessoa("25/02/2000");
        assertEquals(21, pessoa3.getIdade());
        assertEquals("Peixes", pessoa3.getSigno());

        // Resetar o tempo fixo após os testes
        Relogio.resetarTempoFixo();
    }

}
