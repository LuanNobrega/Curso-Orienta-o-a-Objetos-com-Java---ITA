
public class Principal {

	public static void main(String[] args) {
		Pizza pizza1 = new Pizza();
        pizza1.adicionaIngrediente("Queijo");
        pizza1.adicionaIngrediente("Tomate");

        Pizza pizza2 = new Pizza();
        pizza2.adicionaIngrediente("Queijo");
        pizza2.adicionaIngrediente("Presunto");
        pizza2.adicionaIngrediente("Cebola");

        Pizza pizza3 = new Pizza();
        pizza3.adicionaIngrediente("Queijo");
        pizza3.adicionaIngrediente("Calabresa");
        pizza3.adicionaIngrediente("Tomate");
        pizza3.adicionaIngrediente("Azeitona");
        pizza3.adicionaIngrediente("Pimentão");

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarPizza(pizza1);
        carrinho.adicionarPizza(pizza2);
        carrinho.adicionarPizza(pizza3);

        System.out.println("Total do Carrinho de Compras: R$" + carrinho.getTotal());
        
        System.out.println("\nQuantidade utilizada de cada ingrediente:");
        for (String ingrediente : Pizza.getIngredientes().keySet()) {
            System.out.println(ingrediente + ": " + Pizza.getIngredientes().get(ingrediente));
        }

	}

}
