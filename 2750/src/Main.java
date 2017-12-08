import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[sc.nextInt()];
		int temp;
		
		for(int i = 0; i<arr.length; i++){
			arr[i] = sc.nextInt();
			for(int j = i; j>0; j--){
				if(arr[j] <arr[j-1]){
					temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
		
		for(int i = 0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
			
		sc.close();
	}
}
