import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Pessoa {
	private Date dataDeNascimento;

    // Construtor que recebe a data de nascimento como uma string no formato "dd/MM/yyyy"
    public Pessoa(String dataDeNascimento) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        this.dataDeNascimento = dateFormat.parse(dataDeNascimento);
    }

    // Método de acesso para obter a idade da pessoa
    public int getIdade() {
        Date dataAtual = new Date(Relogio.agora()); // Use o Relogio para obter o tempo

        // Calcular a diferença em milissegundos
        long diferencaEmMillis = dataAtual.getTime() - this.dataDeNascimento.getTime();

        // Calcular a idade em anos
        int idadeEmAnos = (int) (diferencaEmMillis / (365.25 * 24 * 60 * 60 * 1000));

        return idadeEmAnos;
    }

    // Método de acesso para obter o signo da pessoa
    public String getSigno() {
        int dia = this.dataDeNascimento.getDate();
        int mes = this.dataDeNascimento.getMonth() + 1; // Janeiro é 0, então adicionamos 1

        // Lógica para determinar o signo
        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 20)) {
            return "Áries";
        } else if ((mes == 4 && dia >= 21) || (mes == 5 && dia <= 20)) {
            return "Touro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            return "Gêmeos";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 21)) {
            return "Câncer";
        } else if ((mes == 7 && dia >= 22) || (mes == 8 && dia <= 22)) {
            return "Leão";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            return "Virgem";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            return "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            return "Escorpião";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            return "Sagitário";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 20)) {
            return "Capricórnio";
        } else if ((mes == 1 && dia >= 21) || (mes == 2 && dia <= 19)) {
            return "Aquário";
        } else {
            return "Peixes";
        }
    }
}
