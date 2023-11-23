import java.util.HashMap;

public class Pizza {

	private static HashMap<String, Integer> ingredientes = new HashMap<>();
    private int quantidadeIngredientes;

    public void adicionaIngrediente(String ingrediente) {
        contabilizaIngrediente(ingrediente);
        quantidadeIngredientes++;
    }

    private static void contabilizaIngrediente(String ingrediente) {
        ingredientes.put(ingrediente, ingredientes.getOrDefault(ingrediente, 0) + 1);
    }

    public int getPreco() {
        if (quantidadeIngredientes <= 2) {
            return 15;
        } else if (quantidadeIngredientes <= 5) {
            return 20;
        } else {
            return 23;
        }
    }

    public static HashMap<String, Integer> getIngredientes() {
        return ingredientes;
    }
    
    public static void zerarIngredientes() {
        ingredientes.clear();
    }
	
}
