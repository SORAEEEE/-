import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int[] num = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		
		for(int i = 0; i<str.length(); i++){
			num[str.charAt(i)-48]++;
		}

		for(int i = 9; i>=0; i--){
			while(num[i] != 0){
				System.out.print(i);
				num[i]--;
			}
		}
		sc. close();
	}
}
 