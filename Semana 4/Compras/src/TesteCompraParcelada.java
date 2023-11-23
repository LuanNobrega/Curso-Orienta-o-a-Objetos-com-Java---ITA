import static org.junit.jupiter.api.Assertions.*;

import java.text.DecimalFormat;

import org.junit.jupiter.api.Test;

class TesteCompraParcelada {
	Compra c;
	
	@Test
	void CompraParcelas1() {
		c = new CompraParcelada(100, 1, 0.05);
		assertEquals(105, c.total());		
	}
	
	@Test
	void CompraParcelas2() {
		c = new CompraParcelada(100, 2, 0.05);
		assertEquals(110.25, c.total());		
	}
	
	@Test
	void CompraParcelas5() {
		c = new CompraParcelada(100, 5, 0.05);
		assertEquals(127.63, c.total());		
	}
	
	@Test
	void CompraParcelas10() {
		c = new CompraParcelada(100, 10, 0.05);
		assertEquals(162.89, c.total());		
	}
	
	

}
