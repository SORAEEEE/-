import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		do {
			arr[N % 10]++;
			N /= 10;
		} while (N != 0);

		// print(arr);
		normalization(arr);
		//print(arr);
		findMax(arr);

		sc.close();
	}

	static void print(int[] arr) {
		for (int i = 0; i < 10; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	static void normalization(int[] arr) {
		int sum = arr[6] + arr[9];
		if (sum % 2 == 1) {
			arr[6] = (sum / 2 + 1);
			arr[9] = (sum / 2 + 1);
		} else {
			arr[6] = (sum / 2);
			arr[9] = (sum / 2);
		}
	}

	static void findMax(int[] arr) {
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}
		System.out.println(max);
	}

}
