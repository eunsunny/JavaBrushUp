package comparator_ex;

import java.util.*;

import comparable_ex.Person;

public class FruitTest {

	public static void main(String[] args) { 
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new DescendingComparator());  //Descending = ��������
		
		treeSet.add(new Fruit("����",5000));
		treeSet.add(new Fruit("����",13000));
		treeSet.add(new Fruit("����",3000));
		treeSet.add(new Fruit("���",9000));
		treeSet.add(new Fruit("������",10000));
		
		Iterator<Fruit> it = treeSet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());  // ��ġ�� ���� ������� ����(Price �� ������� Price �������� ������)
		}

	}

}
