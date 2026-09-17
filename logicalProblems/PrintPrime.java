package logicalProblems;

public class PrintPrime {
	public static void main(String[] args) {

		int start = 10;
		int end = 30;

		for (int i = start; i <= end; i++) {

			boolean isPrime = true;

			if (i < 1) {
				isPrime = false;
			} else {
				for (int j = 2; j <= i / 2; j++) {
					if (i % j == 0) {
						isPrime = false;
						break;
					}
				}
			}
			if (isPrime) {
				System.out.println(i + " ");
			}
		}

	}

}
