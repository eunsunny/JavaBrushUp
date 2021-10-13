package treeset_ex;

import java.util.*;

public class TreeSetTest {

	public static void main(String[] args) {
		Integer[] score = {80,95,50,35,45,65,10,100};  // int(�⺻��) Ÿ���ϸ� Integer(������)�� ȣȯ�� �ȵ�
		
		TreeSet<Integer> score1 = new TreeSet<>(Arrays.asList(score));
		
		//score1.addAll(Arrays.asList(score)); // ���� ��ħ
		System.out.println("���� �� "+score1);
		
		SortedSet<Integer> tail = score1.tailSet(50);
		score1.remove(50);
		System.out.println("50���� ū �� "+tail);
		
		SortedSet<Integer> head = score1.headSet(50);
		System.out.println("50���� ���� �� "+head);
		

		

	}

}
