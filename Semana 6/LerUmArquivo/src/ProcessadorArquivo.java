import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProcessadorArquivo {
	public static Map<String, String> processar(String nomeArquivo) throws LeituraArquivoException {
        Map<String, String> informacoes = new HashMap<>();
        File arquivo = new File(nomeArquivo);

        try (Scanner scanner = new Scanner(arquivo)) {
            if (!scanner.hasNextLine()) {
                throw new LeituraArquivoException("Arquivo vazio");
            }

            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                String[] partes = linha.split("->");

                if (partes.length != 2) {
                    throw new LeituraArquivoException("Formato de arquivo inválido");
                }

                informacoes.put(partes[0].trim(), partes[1].trim());
            }
        } catch (IOException e) {
            throw new LeituraArquivoException("Erro ao abrir o arquivo: " + e.getMessage());
        }

        return informacoes;
    }
}
