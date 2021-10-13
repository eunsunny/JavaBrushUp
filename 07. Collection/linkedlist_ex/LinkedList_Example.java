package linkedlist_ex;

import java.util.*;

public class LinkedList_Example {

	public static void main(String[] args) {
		LinkedList<String> listA = new LinkedList<>();  // 지네릭스 String 뒤에부분 생략 가능
		String[] alpha = {"A","B","C","D","E"};
		
		for (String s : alpha) {
			listA.add(s);
		}
		
		printList(listA);
		
		listA.addFirst("F");
		System.out.println("첫번째 항목 추가 후:");
		printList(listA);
		
		listA.addLast("A");  // 맨마지막에 항목 추가
		System.out.println("마지막 항목 추가 후:");  // 리스트는 중복데이터가 들어갈 수 있음
		printList(listA);
		System.out.println("끝에서 부터 검색하여 A항목 위치:"+listA.lastIndexOf("A"));   //listA.IndexOf("A") : 앞에서 부터의 위치
		
		//PEEK : 첫번째 요소에서 첫번째 항목을 반환
		System.out.println("PEEK 예제");
		System.out.println(listA.peek());
		System.out.println(listA.peek());
		//POLL : 첫번째 요소의 항목을 뺴옴
		System.out.println("POLL 예제");
		System.out.println(listA.poll());
		System.out.println(listA.poll());
		
		// clone
		LinkedList<String> listB = (LinkedList)listA.clone();
		System.out.println("listB="+listB);
		
	}
	
	public static void printList(List list1) {
		System.out.println(list1);
	}

}
