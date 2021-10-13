package linkedlist_ex;

import java.util.*;

public class LinkedList_Example {

	public static void main(String[] args) {
		LinkedList<String> listA = new LinkedList<>();  // ���׸��� String �ڿ��κ� ���� ����
		String[] alpha = {"A","B","C","D","E"};
		
		for (String s : alpha) {
			listA.add(s);
		}
		
		printList(listA);
		
		listA.addFirst("F");
		System.out.println("ù��° �׸� �߰� ��:");
		printList(listA);
		
		listA.addLast("A");  // �Ǹ������� �׸� �߰�
		System.out.println("������ �׸� �߰� ��:");  // ����Ʈ�� �ߺ������Ͱ� �� �� ����
		printList(listA);
		System.out.println("������ ���� �˻��Ͽ� A�׸� ��ġ:"+listA.lastIndexOf("A"));   //listA.IndexOf("A") : �տ��� ������ ��ġ
		
		//PEEK : ù��° ��ҿ��� ù��° �׸��� ��ȯ
		System.out.println("PEEK ����");
		System.out.println(listA.peek());
		System.out.println(listA.peek());
		//POLL : ù��° ����� �׸��� ����
		System.out.println("POLL ����");
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
