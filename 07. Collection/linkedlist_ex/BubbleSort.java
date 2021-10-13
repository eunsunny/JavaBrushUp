package linkedlist_ex;

import java.util.*;

/*
 * 기본적인 알고리즘 문제이니 잘 알고 있어라
 */
public class BubbleSort {

	public static void main(String[] args) {
		
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		
		for (int i=0; i<5; i++) {
			list1.add((int)(Math.random()*100)+1);
			
		}
		
		System.out.println("정렬전 목혹");
		System.out.println(list1);
	//	bubble_sort(list1);  // 정렬 수행
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
		System.out.println("정렬후 목혹");
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
