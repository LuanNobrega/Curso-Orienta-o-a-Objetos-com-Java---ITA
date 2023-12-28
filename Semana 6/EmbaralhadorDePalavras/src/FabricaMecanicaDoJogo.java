import java.util.Random;
import java.util.Scanner;

public class FabricaMecanicaDoJogo {
	public static MecanicaDoJogo criarMecanicaAleatoria(Embaralhador embaralhador, Scanner scanner) {
        int escolha = new Random().nextInt(1); // número de implementações de MecanicaDoJogo
        if (escolha == 0) {
            return new MecanicaSimples(embaralhador, scanner);
        } else {
            // Adicione mais implementações de MecanicaDoJogo conforme necessário
            // Exemplo:
            // return new OutraImplementacaoDeMecanica(embaralhador, scanner);
            return null;
        }
    }
}
