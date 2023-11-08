
public class Paciente {
	double peso;
	double altura;
	
	public Paciente(double peso, double altura) {
		super();
		this.peso = peso;
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double calcularIMC() {
		double IMC = 0;		
		IMC = peso / (altura * altura);
		System.out.println("O IMC é igual a: " + IMC);
		return IMC;		
	}
	
	public String diagnostico(double IMC) {
		if(IMC < 16.0) {
			return "Baixo peso muito grave";
		}
		if(IMC < 16.0) {
			return "Baixo peso muito grave";
		}else if(IMC >= 16.0 && IMC <= 16.99) {
			return "Baixo peso grave";
		}else if(IMC >= 17.0 && IMC <= 18.49) {
			return "Baixo peso";
		}else if(IMC >= 18.50 && IMC <= 24.99) {
			return "Peso normal";
		}else if(IMC >= 25.0 && IMC <= 29.99) {
			return "Sobrepeso";
		}else if(IMC >= 30.0 && IMC <= 34.99) {
			return "Obesidade grau I";
		}else if(IMC >= 35.0 && IMC <= 39.99) {
			return "Obesidade grau II";
		}else if(IMC >= 40.09) {
			return "Obesidade grau III (obesidade mórbida)";
		} else {
			return "Impossível de calcular";
		}		
	}
}
