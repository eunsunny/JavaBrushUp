package linkedlist_ex;

import java.util.*;

/*
 * �⺻���� �˰��� �����̴� �� �˰� �־��
 */
public class BubbleSort {

	public static void main(String[] args) {
		
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		
		for (int i=0; i<5; i++) {
			list1.add((int)(Math.random()*100)+1);
			
		}
		
		System.out.println("������ ��Ȥ");
		System.out.println(list1);
	//	bubble_sort(list1);  // ���� ����
//		for(int j=list1.size()-1; j>=0; j--) {
//			for (int k=0; k<=j-1; k++) {
//				if(list1.get(k) > list1.get(k+1)) {
//					Integer tmp = list1.get(k);
//					list1.set(k, list1.get(k+1));
//					list1.set(k+1, tmp);
//					
//				}
//			}
//		}
		System.out.println("������ ��Ȥ");
		System.out.println(list1);
		
	}
	
	public static void bubble_sort(List<Integer> list) {
		for(int j=list.size()-1; j>=0; j--) {
			for (int k=0; k<=j-1; k++) {
				if(list.get(k) > list.get(k+1)) {
					Integer tmp = list.get(k);
					list.set(k, list.get(k+1));
					list.set(k+1, tmp);
				}
			}
		}
	}

}
