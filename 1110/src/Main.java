import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int newNum = N, sum =0;
		int count = 0;
		
		do{
			sum = (newNum/10)+(newNum%10);
			newNum = (newNum%10) * 10 + (sum%10);
						
			count++;
		}while(N != newNum);
		
		System.out.println(count);
		sc.close();
	}
}
