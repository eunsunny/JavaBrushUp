package comparable_ex;

import java.util.*;

public class ComparableExample {

	public static void main(String[] args) {
		TreeSet<Person> tSet = new TreeSet<>();
		
		/*
		 * ���Ƿ� �Էµ� ���� Person�� �ִ� age ������������ ������� -> Comparable
		 */
		tSet.add(new Person("�̼���", 33));
		tSet.add(new Person("������", 19));
		tSet.add(new Person("�庸��", 40));  // set �̱� ������ Iterator�������
		
		Iterator<Person> it = tSet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
