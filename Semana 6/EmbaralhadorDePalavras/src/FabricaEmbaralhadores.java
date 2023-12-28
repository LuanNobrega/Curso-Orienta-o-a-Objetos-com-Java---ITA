import java.util.Random;

public class FabricaEmbaralhadores {
	private static final Random random = new Random();

    public static Embaralhador criarEmbaralhadorAleatorio() {
        int escolha = random.nextInt(2); // número de implementações de Embaralhador
        if (escolha == 0) {
            return new InverterEmbaralhador();
        } else {
            return new PermutarEmbaralhador();
        }
    }
}
