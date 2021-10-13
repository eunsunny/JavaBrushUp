package treeset_ex;

import java.util.*;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		
		scores.add(Integer.valueOf(87));
		scores.add(98);  // Autoboxing������� �ڵ����� ��Ƽ��Ÿ���� ���� ��
		scores.add(75);
		scores.add(85);
		scores.add(80);
		
		// ���� ���� ������ ���� ����
		Integer point = scores.first();
		System.out.println("���� ���� ������ "+ point);
		
		point = scores.last();
		System.out.println("���� ���� ������ "+ point);
		
		// ������ ������ �տ� �ִ� �׸� ����Ʈ, tail�� �ڱ� �ڽ��� ���������� head�� �������� �ʴ´�
		SortedSet<Integer> head = scores.headSet(85);  //���ĵ� set�����ؼ� ��,,, SortedSet -> ����
		System.out.println(head);  // headSet�� �ִ� ���� �������� �������� ���ĵ� ���� �����°� SortedSet�� �����̴� ������ -> ū����
		
		SortedSet<Integer> tail = scores.tailSet(85);
		System.out.println(tail);  // tailSet�� �ִ� ���� �������� ���ʿ� ���ĵ� ���� ������ �� SortedSet�� �����̴� ������ -> ū����
		
		SortedSet<Integer> subset = scores.subSet(60, 85);  // ������ ��������� �Ҷ� ���� ���� �������� �ʴ´�, 60 <= �װ� < 85
		System.out.println(subset);
		
		// Ʈ���¿� ���Ե� ������ ������������ ������ ����� �����ִ� �� -> descendingSet
		NavigableSet<Integer> descend = scores.descendingSet(); // NavigableSet = Iterator �� ����� �����̶� �����ϸ� ��
		for(Integer item : descend) {
			System.out.println(item);
		}
		
	}

}
