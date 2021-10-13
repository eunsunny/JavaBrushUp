package stack_ex;

import java.util.*;

public class StackExample2Stack {

	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<>();
		Scanner input = new Scanner(System.in);
		
		System.out.print("��ȯ�� ���ڸ� �Է��ϼ���: ");
		int in  = input.nextInt();
		
		System.out.printf("���: %d�� �������� ", in);
		
		while(in > 0) {
			st.push(in%2); // ���簪�� 2�� ���� �������� ���ÿ� ����
			in /= 2;
		} 
		
		while (!st.empty()) {
			System.out.print(st.pop());
		}
		
		System.out.println(" �Դϴ�.");

	}

}
