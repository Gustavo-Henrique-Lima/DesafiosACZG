package desafiosaczg;

public class EvenFibonacciNumbers {
	public static void main(String[] args) {
		int sum = 0;

		int a = 1;
		int b = 2;

		while (a <= 4000000) {
			if (a % 2 == 0) {
				sum += a;
			}

			int next = a + b;
			a = b;
			b = next;
		}
		System.out.println("A soma dos números pares na sequência de Fibonacci que não excedem quatro milhões é: " + sum);
	}

}
