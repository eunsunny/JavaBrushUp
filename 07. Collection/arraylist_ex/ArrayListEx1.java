package arraylist_ex;

import java.util.*;  //  ��̸���Ʈ������ ����Ʈ �ʿ�

public class ArrayListEx1 {  //����Ʈ��� ������ ��ӹ޾Ƽ�,,,,

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);  // ������ ���׸����־���ϴµ� �����󼭾ȴ�

		list1.add(Integer.valueOf(5));  // �����Ͱ� ���� �������� ��, add() = ���ο� �׸� �߰�
		list1.add(4);
		list1.add(2);
		list1.add(3);
		list1.add(1);

		for(int i=0; i<list1.size(); i++) {  // size -> �� ������ ����
			System.out.println(list1.get(i));
		}
		
		//list1 ���� �Ϻ� �׸��� ����  list2�� ����
		ArrayList list2 = new ArrayList(list1.subList(1, 4));  // �ڱ� ��ü����ص���, �տ��ִ� ����Ʈ���� �κ������� �����ͼ�.. ���
																// (1~4�� �ε������� ���,, ���������� ���������ʴ´�,, �� 4���� �Ȱ�����))
		printList(list1, list2);
		
		// set= Ư����ġ�� ���� ����
		list2.set(2, "AA");   // AA ���� �� ��µȰ���
		printList(list1,list2);
		
		// retainAll() = ������ ��ϸ� ����� �������� ����
		list1.retainAll(list2);  // list2(��)�� �׸� ����� ��� ������� ��
		printList(list1,list2);
		
		// contains() = ������ �׸��� ���翩�� Ȯ��
		// list2���� list1�� �����ϴ� �׸��� ã�Ƽ� ����
		int index = 0;
		for(int i=0; i<list1.size(); i++) {
			if(list2.contains(list1.get(i))) {  // 0��° ��Һ��� ������
				index = list2.indexOf(list1.get(i));  // list1�� �׸� ���� list2�� ��ġ�� �˾Ƴ���.
				list2.remove(index);  // list2���� ������ �˾Ƴ� ��ġ�� �׸� ����
			}
		}
		printList(list1,list2);
		
	}
	
	public static void printList(ArrayList list1, ArrayList list2) {
		System.out.println("list1="+list1);
		System.out.println("list2="+list2);
		System.out.println();
	}
	

}
