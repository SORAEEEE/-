import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int caseNum = sc.nextInt();
		int M, N, x, y;
		int max;
		int k;

		for (int i = 0; i < caseNum; i++) {
			M = sc.nextInt();
			N = sc.nextInt();
			x = sc.nextInt();
			y = sc.nextInt();

			max = M * N / gcd(M, N);
			k = x;

			do {
				if (k % N == y || k % N == 0)
					break;

				k += M;
			} while (k < max);

			if (k > max)
				System.out.println("-1");
			else
				System.out.println(k);
		}

		sc.close();
	}

	public static int gcd(int a, int b) {
		if (a < b)
			return gcd(b, a);
		else if (a % b == 0)
			return b;
		else
			return gcd(b, a % b);
	}
}
