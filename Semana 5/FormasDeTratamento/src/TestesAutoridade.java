import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestesAutoridade {

	@Test
    public void testInformal() {
        Autoridade autoridade = new Autoridade("João", "Silva", new Informal());
        assertEquals("João", autoridade.getTratamento());
    }

    @Test
    public void testRespeitosoMasculino() {
        Autoridade autoridade = new Autoridade("José", "Santos", new Respeitoso("M"));
        assertEquals("Sr. Santos", autoridade.getTratamento());
    }

    @Test
    public void testRespeitosoFeminino() {
        Autoridade autoridade = new Autoridade("Ana", "Oliveira", new Respeitoso("F"));
        assertEquals("Sra. Oliveira", autoridade.getTratamento());
    }

    @Test
    public void testComTitulo() {
        Autoridade autoridade = new Autoridade("Carlos", "Andrade", new ComTitulo("Excelentíssimo"));
        assertEquals("Excelentíssimo Carlos Andrade", autoridade.getTratamento());
    }

}
