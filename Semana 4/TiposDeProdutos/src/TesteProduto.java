
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteProduto {

	@Test
    public void testEqualsAndHashCode() {
        Produto produto1 = new Produto("Produto A", 123, 19.99);
        Produto produto2 = new Produto("Produto B", 123, 29.99);
        Produto produto3 = new Produto("Produto C", 456, 39.99);

        // Teste de igualdade com base no código
        assertEquals(produto1, produto2);
        assertNotEquals(produto1, produto3);

        // Teste de hashCode
        assertEquals(produto1.hashCode(), produto2.hashCode());
        assertNotEquals(produto1.hashCode(), produto3.hashCode());
    }

}
