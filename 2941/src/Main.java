import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		for(int i=0; i<croatia.length ; i++){
			str = str.replace(croatia[i]," ");
		}
		
		System.out.println(str.length());
		
		sc.close();
	}
}
