
public class Principal {

	public static void main(String[] args) {
		CompraParcelada c1 = new CompraParcelada(100, 1, 0.05);
		c1.imprimir();
		CompraParcelada c2 = new CompraParcelada(100, 2, 0.05);
		c2.imprimir();
		CompraParcelada c3 = new CompraParcelada(100, 5, 0.05);
		c3.imprimir();
		CompraParcelada c4 = new CompraParcelada(100, 10, 0.05);
		c4.imprimir();
	}

}
