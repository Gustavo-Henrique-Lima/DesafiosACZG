package desafiosaczg;

public class Multiples3of5 {
	public static void main(String[] args) {
		int limit = 1000;
		int sum = 0;

		for (int i = 1; i < limit; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}

		System.out.println("A soma de todos os múltiplos de 3 ou 5 abaixo de 1000 é: " + sum);
	}

}
