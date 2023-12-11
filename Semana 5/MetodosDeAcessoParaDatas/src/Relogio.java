
public class Relogio {
	private static long tempoFixo = 0;

    // Método que retorna o valor de System.currentTimeMillis()
    public static long agora() {
        if (tempoFixo != 0) {
            return tempoFixo;
        } else {
            return System.currentTimeMillis();
        }
    }

    // Método para definir um tempo fixo nos testes
    public static void definirTempoFixo(long novoTempoFixo) {
        tempoFixo = novoTempoFixo;
    }

    // Método para resetar o tempo fixo nos testes
    public static void resetarTempoFixo() {
        tempoFixo = 0;
    }
}
