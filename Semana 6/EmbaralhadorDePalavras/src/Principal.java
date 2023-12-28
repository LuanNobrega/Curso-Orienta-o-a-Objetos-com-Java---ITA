import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Embaralhador embaralhador = FabricaEmbaralhadores.criarEmbaralhadorAleatorio();
        MecanicaDoJogo mecanicaDoJogo = FabricaMecanicaDoJogo.criarMecanicaAleatoria(embaralhador, scanner);
        mecanicaDoJogo.iniciarJogo();
        scanner.close();
    }
}
