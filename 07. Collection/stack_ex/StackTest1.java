package stack_ex;

import java.util.*;

public class StackTest1 {

	public static void main(String[] args) {
		Integer[] intArr = {1001,1002,1003,1004};
		
		Stack<Integer> list = new Stack<>();
		
		for (Integer i : intArr) {
			lis
		}
		
		list.addAll(Arrays.asList(intArr));
		
		System.out.println(list);
		
		String[] strArr = {"�����","�κ� ũ���","15�ҳ� ǥ����","��ȫ�۾�"};
		
		Stack<String> list2 = new Stack<>();
		list2.addAll(Arrays.asList(strArr));
		
		for(int i=0; i<4; i++) {
			strArr[i] = list2.pop();
			int tmp = strArr[i];
			list.push() = strArr[i]; 
			System.out.println(list);
		}

	}

}
