import java.util.Random;
import java.util.Scanner;

public class FabricaMecanicaDoJogo {
	public static MecanicaDoJogo criarMecanicaAleatoria(Embaralhador embaralhador, Scanner scanner) {
        int escolha = new Random().nextInt(1); // número de implementações de MecanicaDoJogo
        if (escolha == 0) {
            return new MecanicaSimples(embaralhador, scanner);
        } else {
            return null;
        }
    }
}
