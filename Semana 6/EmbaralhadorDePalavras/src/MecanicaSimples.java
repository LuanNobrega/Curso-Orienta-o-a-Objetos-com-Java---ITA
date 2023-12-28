import java.util.Scanner;

public class MecanicaSimples implements MecanicaDoJogo {

	private final Embaralhador embaralhador;
    private final Scanner scanner;
    private int pontuacao;
    private int tentativasRestantes;

    public MecanicaSimples(Embaralhador embaralhador, Scanner scanner) {
        this.embaralhador = embaralhador;
        this.scanner = scanner;
        this.pontuacao = 0;
        this.tentativasRestantes = 3; // Defina o número desejado de tentativas
    }

    @Override
    public void iniciarJogo() {
        System.out.println("Bem-vindo ao Jogo das Palavras Embaralhadas!");

        while (tentativasRestantes > 0) {
            String palavraOriginal = BancoDePalavras.obterPalavraAleatoria();
            String palavraEmbaralhada = embaralhador.embaralhar(palavraOriginal);

            System.out.println("Palavra embaralhada: " + palavraEmbaralhada);
            System.out.print("Tente adivinhar a palavra: ");
            
            String tentativaUsuario = scanner.nextLine();

            if (tentativaUsuario.equalsIgnoreCase(palavraOriginal)) {
                System.out.println("Parabéns! Você acertou!");
                pontuacao += 10; 
            } else {
                System.out.println("Ops! Palavra incorreta. Tente novamente.");
                tentativasRestantes--;
            }

            System.out.println("Pontuação atual: " + pontuacao);
            System.out.println("Tentativas restantes: " + tentativasRestantes);
        }

        System.out.println("Fim do jogo. Sua pontuação final é: " + pontuacao);
    }

}
