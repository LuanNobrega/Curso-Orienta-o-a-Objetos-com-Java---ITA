import java.util.Objects;

public class ProdutoComTamanho extends Produto {

	private String tamanho;
	
	// Construtor que chama o construtor da superclasse e inicializa o tamanho
    public ProdutoComTamanho(String nome, int codigo, double preco, String tamanho) {
        super(nome, codigo, preco);
        this.tamanho = tamanho;
    }

    // Sobrescrevendo o método equals para considerar o tamanho
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProdutoComTamanho)) return false;
        if (!super.equals(o)) return false;
        ProdutoComTamanho that = (ProdutoComTamanho) o;
        return Objects.equals(tamanho, that.tamanho);
    }

    // Sobrescrevendo o método hashCode para considerar o tamanho
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tamanho);
    }
	
}
