package validador;

public class Validador {

	public boolean validaM3(int numero) {
		return numero % 3 == 0;

	}

	public boolean validaM5(int numero) {
		return numero % 5 == 0;
	}
	
	public void validaMultiplos(int numero) {
		
		if (validaM3(numero) == true && validaM5(numero)) {
			System.out.println("FizzBuzz");
		} else if (validaM3(numero) == true) {
			System.out.println("Fizz");
		} else if (validaM5(numero) == true) {
			System.out.println("Buzz");
		} else {
			System.out.println(numero);
		}
	}

}
