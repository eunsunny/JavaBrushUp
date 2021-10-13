package stack_ex;

import java.util.*;

public class QueueExample {

	public static void main(String[] args) {
		Queue<String> que = new LinkedList<>();  // Queue�� LinkedList�� �����Ѵ�.
		
		// ������ ����
		que.offer("0");
		que.offer("1");
		que.offer("2");
		que.offer("3");
		
		System.out.println(que);
		
		while(!que.isEmpty()) {
			System.out.println(que.poll());
		}

	}

}
