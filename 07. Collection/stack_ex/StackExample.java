package stack_ex;

import java.util.*;

public class StackExample {

	public static void main(String[] args) {
		Stack<String> st = new Stack();
		
		// 데이터 저장
		st.push("0");
		st.push("1");
		st.push("2");
		st.push("3");
		
		System.out.println(st);
		
		while(!st.empty()) {
			System.out.println(st.pop());
		}

	}

}
