import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileWriter;
import java.util.Map;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class ProcessadorArquivoTest {

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    @Test
    public void testProcessarArquivoSucesso() {
        try {
            // Cria um arquivo temporário com conteúdo válido
            File file = folder.newFile("arquivo.txt");
            FileWriter writer = new FileWriter(file);
            writer.write("nome->Eduardo\n");
            writer.write("sobrenome->Guerra\n");
            writer.write("idade->35\n");
            writer.close();

            Map<String, String> informacoes = ProcessadorArquivo.processar(file.getAbsolutePath());
            assertEquals(3, informacoes.size());
            assertEquals("Eduardo", informacoes.get("nome"));
            assertEquals("Guerra", informacoes.get("sobrenome"));
            assertEquals("35", informacoes.get("idade"));
        } catch (Exception e) {
            fail("Exceção inesperada: " + e.getMessage());
        }
    }

    @Test
    public void testProcessarArquivoVazio() {
        try {
            // Cria um arquivo temporário vazio
            File file = folder.newFile("arquivo.txt");

            ProcessadorArquivo.processar(file.getAbsolutePath());
            fail("Deveria ter lançado uma LeituraArquivoException para arquivo vazio.");
        } catch (LeituraArquivoException e) {
            assertEquals("Arquivo vazio", e.getMessage());
        } catch (Exception e) {
            fail("Exceção inesperada: " + e.getMessage());
        }
    }

    @Test
    public void testProcessarArquivoInvalido() {
        try {
            // Cria um arquivo temporário com formato inválido
            File file = folder.newFile("arquivo.txt");
            FileWriter writer = new FileWriter(file);
            writer.write("nome->Eduardo\n");
            writer.write("sobrenome:Guerra\n"); // Formato inválido
            writer.close();

            ProcessadorArquivo.processar(file.getAbsolutePath());
            fail("Deveria ter lançado uma LeituraArquivoException para formato inválido.");
        } catch (LeituraArquivoException e) {
            assertEquals("Formato de arquivo inválido", e.getMessage());
        } catch (Exception e) {
            fail("Exceção inesperada: " + e.getMessage());
        }
    }

    @Test
    public void testProcessarArquivoInexistente() {
        try {
            ProcessadorArquivo.processar("C:\\Users\\Pessoal\\eclipse-workspace\\LerUmArquivo\\src\\arquivo.txt");
        } catch (LeituraArquivoException e) {
            assertEquals("Erro ao abrir o arquivo: arquivo.txt (No such file or directory)", e.getMessage());
        }
    }
}
