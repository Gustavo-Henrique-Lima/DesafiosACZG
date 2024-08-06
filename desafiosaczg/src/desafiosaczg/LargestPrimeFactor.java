package desafiosaczg;

public class LargestPrimeFactor {
	public static void main(String[] args) {
		long number = 600851475143L;
		long largestPrimeFactor = findLargestPrimeFactor(number);
		System.out.println("O maior fator primo de " + number + " é " + largestPrimeFactor);
	}

	private static long findLargestPrimeFactor(long number) {
		long largestFactor = -1;

		while (number % 2 == 0) {
			largestFactor = 2;
			number /= 2;
		}

		for (long i = 3; i <= Math.sqrt(number); i += 2) {
			while (number % i == 0) {
				largestFactor = i;
				number /= i;
			}
		}

		if (number > 2) {
			largestFactor = number;
		}

		return largestFactor;
	}
}
