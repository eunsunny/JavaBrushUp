package arraylist_ex;

import java.util.*;

public class ListIteratorEx {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();		
		
		list1.add("�̼���");
		list1.add("�念��");
		list1.add("������");
		list1.add("�庸��");
		list1.add("��âȣ");
		
		ListIterator lit = list1.listIterator();
		
		// ���������� �����ϸ鼭 �о� ��.
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
		
		System.out.println();
		
		// ���������� �����ϸ鼭 �о� ��.
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}

	}

}
