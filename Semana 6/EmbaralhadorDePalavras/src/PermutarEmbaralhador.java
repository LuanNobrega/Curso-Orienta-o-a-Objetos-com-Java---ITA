import java.util.Random;

public class PermutarEmbaralhador implements Embaralhador {

	@Override
    public String embaralhar(String palavra) {
        char[] caracteres = palavra.toCharArray();
        int comprimento = caracteres.length;

        Random random = new Random();

        for (int i = 0; i < comprimento; i++) {
            int indiceTroca = random.nextInt(comprimento);

            // Troca de caracteres
            char temp = caracteres[i];
            caracteres[i] = caracteres[indiceTroca];
            caracteres[indiceTroca] = temp;
        }

        return new String(caracteres);
    }

}
