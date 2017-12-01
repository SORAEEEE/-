import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tcNum = sc.nextInt();
		String str;
		int repeat;
		int i, j, k;

		for (i = 0; i < tcNum; i++) {
			repeat = sc.nextInt();
			str = sc.next();

			for (j = 0; j < str.length(); j++) {
				for (k = 0; k < repeat; k++) {
					System.out.print(str.charAt(j));
				}
			}
			System.out.println();
		}
	}
}
