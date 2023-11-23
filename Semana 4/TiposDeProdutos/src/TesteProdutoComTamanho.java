
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class TesteProdutoComTamanho {

	@Test
    public void testEqualsAndHashCode() {
        ProdutoComTamanho produto1 = new ProdutoComTamanho("Camiseta", 123, 19.99,"M");
        ProdutoComTamanho produto2 = new ProdutoComTamanho("Camiseta", 123, 29.99,"M");
        ProdutoComTamanho produto3 = new ProdutoComTamanho("Calça", 456, 39.99, "G");

        // Teste de igualdade com base no código e tamanho
        assertEquals(produto1, produto2);
        assertNotEquals(produto1, produto3);

        // Teste de hashCode
        assertEquals(produto1.hashCode(), produto2.hashCode());
        assertNotEquals(produto1.hashCode(), produto3.hashCode());
    }

}
