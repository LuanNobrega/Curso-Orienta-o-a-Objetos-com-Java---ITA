import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteAutenticador {

	@Test
	public void loginComSucesso() throws LoginException {
		Autenticador a = new Autenticador();
		Usuario u = a.logar("guerra", "senhadoguerra");
		assertEquals("guerra", u.getLogin());		
	}
	
	@Test
    public void loginFalha() {
        Autenticador a = new Autenticador();
        assertThrows(LoginException.class, () -> {
            a.logar("guerra", "senhaIncorreta");
        });
    }
	
	@Test
    public void informacaoDoErro() {
        Autenticador a = new Autenticador();
        try {
        	Usuario u = a.logar("guerra", "senhaIncorreta");
        	fail();
		} catch (LoginException e) {
			assertEquals("guerra", e.getLogin());
		}
        
    }
}
