import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		while(sc.next()!="%n"){
			num++;
		}
		
		System.out.println(num);
	}
}
