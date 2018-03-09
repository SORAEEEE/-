import java.util.Scanner;
class Contents{
	private int status;
	private boolean isTarget;
	
	public Contents(int status, boolean isTarget){
		this.status = status;
		this.isTarget = isTarget;
	}

	public boolean getTarget() {
		return isTarget;
	}

	public int getStatus() {
		return status;
	}
	
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		int N, M;
		
		for (int i = 0; i < TC; i++) {
			
		}

		sc.close();
	} 
}
