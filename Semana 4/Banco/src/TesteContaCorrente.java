import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class TesteContaCorrente {
	
	ContaCorrente cc;

	@Test
	void deposito() {
		cc = new ContaCorrente();
		cc.depositar(200);
		assertEquals(cc.saldo, 200);
	}
	
	@Test
	void saque() {
		cc = new ContaCorrente();
		cc.depositar(200);
		cc.sacar(50);
		assertEquals(cc.saldo, 150);
	}
	
	@Test
	void saquemaiorQueSaldo() {
		cc = new ContaCorrente();
		cc.depositar(200);
		int valorSacado = cc.sacar(250);
		assertEquals(cc.saldo, 200);
		assertEquals(valorSacado, 0);
	}
}


