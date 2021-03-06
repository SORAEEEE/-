import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int remain = 0;
		int[] num = new int[N / 5 + 1];

		for (int i = N / 5; i >= 0; i--) {
			remain = N - 5 * i;
			num[i] = 0;
			if (remain % 3 == 0)
				num[i] = i + (remain / 3);
		}

		int min = findMin(num);
		System.out.println(min);

		sc.close();
	}

	public static int findMin(int[] arr) {
		int min = 5000;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0)
				continue;

			if (min > arr[i])
				min = arr[i];
		}

		if (min == 5000)
			return -1;
		else
			return min;
	}

}
