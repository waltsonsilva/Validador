package testeValidador;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import validador.Validador;

public class TesteValidador extends TestCase {

	Validador validador = new Validador();
	static int numero = 0;

	@Before
	public void setUp() {
		numero = 28;
	}

	@Test
	public void CT01Multiplo3() {

		boolean retorno = validador.validaM3(numero);
		assertTrue(retorno);

	}

	@Test
	public void CT02Multiplo5() {

		boolean retorno = validador.validaM5(numero);
		assertTrue(retorno);

	}



}
