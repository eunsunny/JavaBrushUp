package hashset__ex;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> fruits = new HashSet<>();
		
		//������ �߰�:: add()
		fruits.add("Apple");
		fruits.add("Banana");
		
		// set�� ����ִ��� Ȯ��:: isEmplty() = true(set�� �������), false(������� ����))
		System.out.println("fruits set�� ��� �ֳ���?? "+fruits.isEmpty());
		
		//Ư�� �׸��� ���翩�� : contains()
		System.out.println("fruits�� Apple�� ���ԵǾ� �ֳ���?? "+fruits.contains("Apple"));
		
		// �����׸� ���� : remove()
		System.out.println("fruits set���� 'Apple' ����: "+fruits.remove("Apple"));
		
		// set�� �׸� ���� : size()
		System.out.println("fruits�� �׸� ������ "+fruits.size());
		
		// addAll ����
		System.out.println("�߰��� set�� ����:"+fruits);
		List<String> list1 = new ArrayList<>();
		list1.add("Apple");
		list1.add("Apple"); // �ߺ��� ������� ����
		list1.add("Mango");
		list1.add("Orange");
		fruits.addAll(list1);  //list�� ������ fruits�� add
		System.out.println("�߰��� set�� ����:"+fruits);
		
		//remove
		fruits.remove("Orange");
		System.out.println("���� �� set�� ����:"+fruits);
		

	}

}
