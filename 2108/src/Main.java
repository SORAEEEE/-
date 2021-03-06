import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		double sum = 0.0;
		int min = 4000;
		int max = -4000;

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
			if (arr[i] > max)
				max = arr[i];
			if (arr[i] < min)
				min = arr[i];
		}

		Arrays.sort(arr);

		System.out.format("%.0f%n", (sum / N)); // 산술평균
		System.out.println(arr[(N - 1) / 2]); // 중앙값
		System.out.println(findMany(arr)); // 최빈값
		System.out.println((max - min)); // 범위
		sc.close();
	}

	static int findMany(int[] arr) {
		int manyCount = 0; // 최빈값 개수
		int[] manyVal = { arr[0], arr[arr.length - 1] }; // 최빈값
		boolean flag = false; // 같은게 있으면 true

		for (int i = 0; i < arr.length; i++) {
			int j = i;
			int count = 1;

			if (i == arr.length - 1)
				break;

			while (arr[j] == arr[j + 1]) {
				count++;
				j++;
				if (j >= arr.length - 1)
					break;
			}

			if (count > manyCount) {
				manyCount = count;
				manyVal[0] = arr[i];
				manyVal[1] = arr[arr.length - 1];
				flag = false;
			} else if (count == manyCount) {
				flag = true;
				if (manyVal[1] < arr[i]) {
				} else {
					manyVal[1] = arr[i];
				}
			}

			i = j; // 이미본거 넘어가기
		}

		if (flag == true)
			return manyVal[1];
		return manyVal[0];
	}
}
