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
			if (val == '(' || val == '[') {// ���°�ȣ
				bracket.push(val);
			}
			else if(val == ')'){//�ݴ°�ȣ1
				if('(' != bracket.pop()){//�ùٸ��� ���� ��ȣ��
					System.out.println("0");
					return;
				}
				
				if(bracket.peek)
				
				
			}

		}

		sc.close();
	}
}
