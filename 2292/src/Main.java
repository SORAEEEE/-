import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i = 1;

		while (N / sum(i) != 0) {
			i++;
		}

		System.out.println(i);

		sc.close();
	}

	static int sum(int i) {
		return (3 * i * (i - 1) + 2);
	}
}
