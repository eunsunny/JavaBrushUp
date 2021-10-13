package linkedlist_ex;

import java.util.*;

public class LinkedListEx1 {

	public static void main(String[] args) {
		
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		
		for (int i=0; i<10; i++) {
			int b = (int)(Math.random()*100)+1;
			list1.add(b);
		}
		
		System.out.println(list1);
		int tmp = 0;
		tmp = list1.get(3);
		
		list1.set(3,list1.get(4));
		
		list1.set(4, tmp);
		
		System.out.println(list1);

	}
	
}
