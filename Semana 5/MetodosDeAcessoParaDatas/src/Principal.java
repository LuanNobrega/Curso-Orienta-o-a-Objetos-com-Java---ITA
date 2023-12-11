import java.text.ParseException;

public class Principal {

	public static void main(String[] args) throws ParseException {
		// Testes de unidade com diferentes datas de nascimento
        Relogio.definirTempoFixo(1641049200000L); // Define um tempo fixo para os testes

        Pessoa pessoa1 = new Pessoa("15/05/1990");
        System.out.println("Idade: " + pessoa1.getIdade() + " anos");
        System.out.println("Signo: " + pessoa1.getSigno());

        Pessoa pessoa2 = new Pessoa("03/11/1985");
        System.out.println("Idade: " + pessoa2.getIdade() + " anos");
        System.out.println("Signo: " + pessoa2.getSigno());

        Pessoa pessoa3 = new Pessoa("25/02/2000");
        System.out.println("Idade: " + pessoa3.getIdade() + " anos");
        System.out.println("Signo: " + pessoa3.getSigno());

        Relogio.resetarTempoFixo(); // Resetar o tempo fixo após os testes

	}

}
