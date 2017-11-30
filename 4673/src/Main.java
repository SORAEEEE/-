
public class Main {
	public static void main(String[] args) {
		final int N = 10001;
		
		boolean[] arr = new boolean[N];

		for (int i = 1; i < N; i++) {
			if(findSelf(i)<N){
				arr[findSelf(i)] = true;
			}
		}

		for (int i = 1; i < N; i++) {
			if (arr[i] == false)
				System.out.println(i);
		}
	}

	static int findSelf(int i) {
		int num = i;

		while (i != 0) {
			num += i % 10;
			i = i / 10;
		}
		return num;
	}
}
