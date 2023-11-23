import java.text.DecimalFormat;

public class CompraParcelada extends Compra{
	private int qtdPArcelas;
	private double jurosMensais;
	
	public CompraParcelada(double valor, int qtdPArcelas, double jurosMensais) {
		super(valor);
		this.qtdPArcelas = qtdPArcelas;
		this.jurosMensais = jurosMensais;
	}

	@Override
    public double total() {
        double valorTotal = getValor() * Math.pow((1 + jurosMensais), qtdPArcelas);
        // Formata o valor com duas casas decimais
        DecimalFormat formato = new DecimalFormat("#.##");
        String valorFormatado = formato.format(valorTotal);
        // Substitui a vírgula por um ponto e converte para double
        valorTotal = Double.parseDouble(valorFormatado.replace(",", "."));
        return valorTotal;
    }
	
	public void imprimir() {
		System.out.println("O valor total é: "+total());
	}
	
}
