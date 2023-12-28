import java.util.Random;

public class InverterEmbaralhador implements Embaralhador {

	@Override
    public String embaralhar(String palavra) {
        char[] caracteres = palavra.toCharArray();
        int comprimento = caracteres.length;

        Random random = new Random();

        for (int i = 0; i < comprimento / 2; i++) {
            int indiceTroca = random.nextInt(comprimento - i) + i;

            // Troca de caracteres
            char temp = caracteres[i];
            caracteres[i] = caracteres[indiceTroca];
            caracteres[indiceTroca] = temp;
        }

        return new String(caracteres);
    }

}
