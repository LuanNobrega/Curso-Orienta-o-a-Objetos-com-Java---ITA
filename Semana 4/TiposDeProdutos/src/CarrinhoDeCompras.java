import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {
	private Map<ProdutoComTamanho, Integer> itensNoCarrinho;

    public CarrinhoDeCompras() {
        this.itensNoCarrinho = new HashMap<>();
    }
    
    

    public Map<ProdutoComTamanho, Integer> getItensNoCarrinho() {
		return itensNoCarrinho;
	}



	public void setItensNoCarrinho(Map<ProdutoComTamanho, Integer> itensNoCarrinho) {
		this.itensNoCarrinho = itensNoCarrinho;
	}



	// Adiciona um produto ao carrinho com a quantidade especificada
    public void adicionaProduto(ProdutoComTamanho produto, int quantidade) {
        if (itensNoCarrinho.containsKey(produto)) {
            // Se o produto já existe no carrinho, adiciona a quantidade especificada
            int quantidadeAtual = itensNoCarrinho.get(produto);
            itensNoCarrinho.put(produto, quantidadeAtual + quantidade);
        } else {
            // Se o produto não existe no carrinho, adiciona com a quantidade especificada
            itensNoCarrinho.put(produto, quantidade);
        }
    }

    // Remove a quantidade especificada do produto no carrinho
    public void removeProduto(ProdutoComTamanho produto, int quantidade) {
        if (itensNoCarrinho.containsKey(produto)) {
            int quantidadeAtual = itensNoCarrinho.get(produto);
            if (quantidade >= quantidadeAtual) {
                // Se a quantidade a ser removida for maior ou igual à quantidade atual, remove o produto do carrinho
                itensNoCarrinho.remove(produto);
            } else {
                // Caso contrário, apenas diminui a quantidade
                itensNoCarrinho.put(produto, quantidadeAtual - quantidade);
            }
        }
    }

    // Calcula o valor total da compra
    public double calcularValorTotal() {
        double valorTotal = 0.0;
        for (Map.Entry<ProdutoComTamanho, Integer> entry : itensNoCarrinho.entrySet()) {
            ProdutoComTamanho produto = entry.getKey();
            int quantidade = entry.getValue();
            valorTotal += produto.getPreco() * quantidade;
        }
        return valorTotal;
    }

    // Exemplo de uso
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        ProdutoComTamanho produto1 = new ProdutoComTamanho("Camiseta", 123, 19.99, "M");
        ProdutoComTamanho produto2 = new ProdutoComTamanho("Camiseta", 123, 29.99, "G");

        carrinho.adicionaProduto(produto1, 2);
        carrinho.adicionaProduto(produto2, 1);

        System.out.println("Valor total do carrinho: " + carrinho.calcularValorTotal());
    }
}
