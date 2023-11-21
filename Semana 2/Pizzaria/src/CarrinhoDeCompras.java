
public class CarrinhoDeCompras {

	private int total;

    public void adicionarPizza(Pizza pizza) {
        if (pizza.getPreco() > 0) {
            total += pizza.getPreco();
        } else {
            System.out.println("A pizza deve conter pelo menos um ingrediente.");
        }
    }

    public int getTotal() {
        return total;
    }
	
}
