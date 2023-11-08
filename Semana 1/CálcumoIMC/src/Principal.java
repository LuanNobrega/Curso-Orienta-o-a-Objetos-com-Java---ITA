
public class Principal {

	public static void main(String[] args) {
		
		Paciente p1 = new Paciente(80.2, 1.79);
		Paciente p2 = new Paciente(85.7, 1.69);
		Paciente p3 = new Paciente(65.0, 1.74);
		
		System.out.println(p1.diagnostico(p1.calcularIMC()));
		System.out.println(p2.diagnostico(p2.calcularIMC()));
		System.out.println(p3.diagnostico(p3.calcularIMC()));
		
		
	}

}
