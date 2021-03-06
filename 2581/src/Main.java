import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		int primeCount = 0;
		int primeSum = 0;
		int primeMin = N;

		for (; M <= N; M++) {
			if (isPrime(M)) {
				primeCount++;
				primeSum += M;
				if (primeMin > M) {
					primeMin = M;
				}
			}
		}

		if (primeCount == 0) {
			System.out.println(-1);
		} else {
			System.out.println(primeSum);
			System.out.println(primeMin);
		}

		sc.close();
	}

	public static boolean isPrime(int a) {
		if (a < 2)
			return false;

		for (int i = 2; i <= Math.sqrt(a); i++) {
			if (a % i == 0)
				return false;
		}

		return true;
	}
}
