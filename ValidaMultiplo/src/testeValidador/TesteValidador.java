package testeValidador;

import org.junit.Test;

import junit.framework.TestCase;
import validador.ValidadorM3;
import validador.ValidadorM5;

public class TesteValidador extends TestCase {
	ValidadorM3 validaM3 =  new ValidadorM3();
	ValidadorM5 validaM5 = new ValidadorM5();
	@Test
	public void testCaseM3CT01() {
		int numero = 15;
		boolean resultado = true;
		
		boolean Retorno = validaM3.validaM3(numero);
		assertEquals(resultado, Retorno);
		
	}
	@Test
	public void testCaseM5CT02() {
		int numero = 15;
		boolean resultado = true;
		
		boolean Retorno = validaM5.validaM5(numero);
		assertEquals(resultado, Retorno);
		
	}
	
	@Test
	public void testCaseM3CT03() {
		int numero = 10;
		boolean resultado = false;
		
		boolean Retorno = validaM3.validaM3(numero);
		assertEquals(resultado, Retorno);
		
	}
	
	@Test
	public void testCaseM3CT04() {
		int numero = 11;
		boolean resultado = false;
		
		boolean Retorno = validaM5.validaM5(numero);
		assertEquals(resultado, Retorno);
		
	}
	
	@Test
	public void testCaseCT05(){
		int numero = 30;
		boolean resultado = true;
		
		boolean retorno;
		
		if (validaM3.validaM3(numero) == true && validaM5.validaM5(numero) == true) {
			 retorno = true;
		}else {
			retorno = false;
		}
		assertEquals(resultado, retorno);
		
	}
	

}
