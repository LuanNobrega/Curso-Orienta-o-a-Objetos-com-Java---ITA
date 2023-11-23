import java.util.Objects;

public class Produto {
	
	private String nome;
	private int codigo;
	private double preco;
	
	public Produto(String nome, int codigo, double preco) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	// Sobrescrevendo o método equals para comparar com base no código
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return codigo == produto.codigo;
    }

    // Sobrescrevendo o método hashCode para gerar um código com base no código do produto
    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

}
