import java.util.Scanner;

public class Main {
	static final int MAX = 1001;

	public static void main(String[] args) {
		boolean prime[] = new boolean[MAX];
		prime[1] = true;

		for (int i = 2; i < MAX; i++) {
			if (prime[i])
				continue;
			for (int j = 2 * i; j < MAX; j += i) {
				prime[j] = true;
			}
		}

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int temp;
		int count = 0;
		
		for(int i = 0; i<N; i++){
			temp = sc.nextInt();
			if(prime[temp] == false)
				count++;
		}
		
		System.out.println(count);
		sc.close();
	}
}
