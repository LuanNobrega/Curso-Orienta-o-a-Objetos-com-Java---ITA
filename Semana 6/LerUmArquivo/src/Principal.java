import java.util.Map;

public class Principal {

	public static void main(String[] args) {
        // Exemplo de utilização:
        try {
            Map<String, String> informacoes = ProcessadorArquivo.processar("C:\\Users\\Pessoal\\eclipse-workspace\\LerUmArquivo\\src\\arquivo.txt");
            System.out.println("Informações do arquivo:");
            for (Map.Entry<String, String> entry : informacoes.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        } catch (LeituraArquivoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

}
