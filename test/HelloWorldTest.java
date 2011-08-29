
import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class HelloWorldTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void deveImprimirMensagemHelloWorld(){
		
		MinhaPrimeiraAplicacao primeiraApp = new MinhaPrimeiraAplicacao();
		String mensagemHelloWorld = primeiraApp.imprimeMensagemHelloWorld();
		Assert.assertEquals("Deveria ter sido impresso a mensagem HelloWorld", "hello world",mensagemHelloWorld);
		
	}
	
	@Test
	public void deveFalharDevidoAMensagemRetornadaSerSempreHellowWorld(){
		
		MinhaPrimeiraAplicacao primeiraApp = new MinhaPrimeiraAplicacao();
		String mensagemHelloWorld = primeiraApp.imprimeMensagemHelloWorld();
		Assert.assertFalse("Deveria ter sido impresso a mensagem HelloWorld", "Ola Mundo".equals(mensagemHelloWorld));
		
	}

}
