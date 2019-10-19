package validador;

import validadorInterface.IValidador;

public class ExecutaValidador implements IValidador {

	public static void main(String[] args) {
		int numero = 30;
		ExecutaValidador executaValidador = new ExecutaValidador();
		executaValidador.validaM(numero);
	}
	
	@Override
	public void validaM(int numero) {
		ValidadorM3 validaM3 = new ValidadorM3();
		ValidadorM5 validaM5 = new ValidadorM5();

		if (validaM3.validaM3(numero) == true && validaM5.validaM5(numero)) {
			System.out.println("FizzBuzz");
		} else if (validaM3.validaM3(numero) == true) {
			System.out.println("Fizz");
		} else if (validaM5.validaM5(numero) == true) {
			System.out.println("Buzz");
		} else {
			System.out.println(numero);
		}
	}
}
