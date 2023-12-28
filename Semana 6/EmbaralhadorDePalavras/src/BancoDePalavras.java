import java.util.Random;

public class BancoDePalavras {
	private static final String[] PALAVRAS = {
		    "algoritmo", "variavel", "condicional", "loop", "funcao",
		    "programador", "linguagem", "compilador", "debug", "array",
		    "estrutura", "classe", "objeto", "heranca", "polimorfismo",
		    "interface", "metodo", "biblioteca", "framework", "codigo"
		};

    public static String obterPalavraAleatoria() {
        int indice = new Random().nextInt(PALAVRAS.length);
        return PALAVRAS[indice];
    }
}
