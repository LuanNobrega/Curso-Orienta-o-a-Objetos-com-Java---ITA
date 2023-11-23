import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class PizzaCarrinhoTest {

	 	@Before
	    public void setUp() {
	        Pizza.zerarIngredientes();
	    }

	    @Test
	    public void testPrecoPizzaComDoisIngredientes() {
	        Pizza pizza = new Pizza();
	        pizza.adicionaIngrediente("Queijo");
	        pizza.adicionaIngrediente("Tomate");
	        assertEquals(15, pizza.getPreco());
	    }

	    @Test
	    public void testPrecoPizzaComCincoIngredientes() {
	        Pizza pizza = new Pizza();
	        pizza.adicionaIngrediente("Queijo");
	        pizza.adicionaIngrediente("Presunto");
	        pizza.adicionaIngrediente("Cebola");
	        pizza.adicionaIngrediente("Tomate");
	        pizza.adicionaIngrediente("Azeitona");
	        assertEquals(20, pizza.getPreco());
	    }

	    @Test
	    public void testPrecoPizzaComSeteIngredientes() {
	        Pizza pizza = new Pizza();
	        pizza.adicionaIngrediente("Queijo");
	        pizza.adicionaIngrediente("Calabresa");
	        pizza.adicionaIngrediente("Tomate");
	        pizza.adicionaIngrediente("Azeitona");
	        pizza.adicionaIngrediente("Pimentão");
	        pizza.adicionaIngrediente("Bacon");
	        pizza.adicionaIngrediente("Cebola");
	        assertEquals(23, pizza.getPreco());
	    }

	    @Test
	    public void testRegistroIngredientes() {
	        Pizza pizza = new Pizza();
	        pizza.adicionaIngrediente("Queijo");
	        pizza.adicionaIngrediente("Tomate");
	        pizza.adicionaIngrediente("Cebola");

	        assertEquals(Integer.valueOf(3), Pizza.getIngredientes().get("Queijo"));
	        assertEquals(Integer.valueOf(3), Pizza.getIngredientes().get("Tomate"));
	        assertEquals(Integer.valueOf(3), Pizza.getIngredientes().get("Cebola"));
	    }

	    @Test
	    public void testCarrinhoDeComprasTotal() {
	        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

	        Pizza pizza1 = new Pizza();
	        pizza1.adicionaIngrediente("Queijo");
	        pizza1.adicionaIngrediente("Tomate");

	        Pizza pizza2 = new Pizza();
	        pizza2.adicionaIngrediente("Queijo");
	        pizza2.adicionaIngrediente("Presunto");
	        pizza2.adicionaIngrediente("Cebola");

	        Pizza pizza3 = new Pizza(); // Pizza sem ingredientes

	        carrinho.adicionarPizza(pizza1);
	        carrinho.adicionarPizza(pizza2);
	        carrinho.adicionarPizza(pizza3);

	        assertEquals(50, carrinho.getTotal());
	    }

	    @Test
	    public void testCarrinhoDeComprasPizzaSemIngredientes() {
	        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
	        Pizza pizza = new Pizza(); // Pizza sem ingredientes
	        carrinho.adicionarPizza(pizza);
	    }

	    @After
	    public void tearDown() {
	        Pizza.zerarIngredientes();
	    }

}
