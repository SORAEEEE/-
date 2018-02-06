import java.util.Scanner;
import java.util.Stack;

public class Main { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Stack<Character> bracket = new Stack<Character>();
		String number;
		char val;
		char temp;
		
		for (int i = 0; i < str.length(); i++) {
			val = str.charAt(i);
			if (val == '(' || val == '[') {// ¿©´Â°ýÈ£
				bracket.push(val);
			}
			else if(val == ')'){//´Ý´Â°ýÈ£1
				if('(' != bracket.pop()){//¿Ã¹Ù¸£Áö ¸øÇÑ °ýÈ£¿­
					System.out.println("0");
					return;
				}
				
				if(bracket.peek)
				
				
			}

		}

		sc.close();
	}
}
