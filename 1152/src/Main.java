import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str, " ");

		System.out.println(st.countTokens());
		sc.close();


		/*
		 for (int i = 0; i < str.length(); i++) {
			if (str.substring(i, i + 1).equals(" ")) {
				for (int j = 1; j < str.length() - i; j++) {
					if (!str.substring(i + j, i + j + 1).equals(" ")){
						num++;
						break;
					}
				}

			}
		}
		*/
		
	}
}
