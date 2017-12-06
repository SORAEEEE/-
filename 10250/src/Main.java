import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int caseNum = sc.nextInt();
		int H, W, N;

		for (int i = 0; i < caseNum; i++) {
			H = sc.nextInt();
			W = sc.nextInt();
			N = sc.nextInt() - 1;

			System.out.print((N % H + 1));

			
			W = (N / H) + 1;
			if (W > 9)
				System.out.println(W);
			else
				System.out.println("0" + W);

		}

		sc.close();
	}
}
