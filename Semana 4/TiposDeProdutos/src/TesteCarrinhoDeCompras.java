
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class TesteCarrinhoDeCompras {

	@Test
    public void testAdicionaECalculaValorTotal() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        ProdutoComTamanho produto1 = new ProdutoComTamanho("Camiseta", 123, 19.99, "M");
        ProdutoComTamanho produto2 = new ProdutoComTamanho("Calça", 456, 39.99, "G");

        carrinho.adicionaProduto(produto1, 2);
        carrinho.adicionaProduto(produto2, 1);

        // Teste para verificar se os produtos foram adicionados corretamente
        assertEquals(2, carrinho.getItensNoCarrinho().get(produto1));
        assertEquals(1, carrinho.getItensNoCarrinho().get(produto2));

        // Teste para verificar o cálculo do valor total
        assertEquals(79.97, carrinho.calcularValorTotal(), 0.01);
    }

    @Test
    public void testRemoveProduto() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        ProdutoComTamanho produto1 = new ProdutoComTamanho("Camiseta", 123, 19.99, "M");
        ProdutoComTamanho produto2 = new ProdutoComTamanho("Calça", 456, 39.99, "G");

        carrinho.adicionaProduto(produto1, 2);
        carrinho.adicionaProduto(produto2, 1);

        // Teste para verificar se a remoção de produto funciona corretamente
        carrinho.removeProduto(produto1, 1);
        assertEquals(1, carrinho.getItensNoCarrinho().get(produto1));
        carrinho.removeProduto(produto2, 2);
        assertFalse(carrinho.getItensNoCarrinho().containsKey(produto2));
    }

}
