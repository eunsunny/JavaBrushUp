package stack_ex;

import java.util.*;

public class StackExample2Stack {

	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<>();
		Scanner input = new Scanner(System.in);
		
		System.out.print("변환할 숫자를 입력하세요: ");
		int in  = input.nextInt();
		
		System.out.printf("결과: %d는 이진수로 ", in);
		
		while(in > 0) {
			st.push(in%2); // 현재값을 2로 나눈 나머지를 스택에 저장
			in /= 2;
		} 
		
		while (!st.empty()) {
			System.out.print(st.pop());
		}
		
		System.out.println(" 입니다.");

	}

}
