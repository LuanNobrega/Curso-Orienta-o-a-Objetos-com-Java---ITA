import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarroTestSoma {

	CarroDeCorrida c;
	
	public void inicializaCarro() {
		c = new CarroSoma("teste", 10, 100);
	}
	
	@Test
	public void testCarroParado() {
		inicializaCarro();
		assertEquals(0, c.getVelocidade());
	}
	
	@Test
	public void testAcelerar() {
		inicializaCarro();
		c.acelerar();
		assertEquals(10, c.getVelocidade());
	}
	
	@Test
	public void testFrear() {
		inicializaCarro();
		c.acelerar();
		c.frear();
		assertEquals(5, c.getVelocidade());
	}
	
	@Test
	public void testFrearAteZero() {
		inicializaCarro();
		c.frear();
		c.frear();
		c.frear();
		c.frear();
		c.frear();
		assertEquals(0, c.getVelocidade());
	}
	
	@Test
	public void testAcelerarAteVekocidadeMaxima() {
		inicializaCarro();
		for(int i=0; i<14; i++) {
			c.acelerar();			
		}
		assertEquals(100, c.getVelocidade());
	}

}
