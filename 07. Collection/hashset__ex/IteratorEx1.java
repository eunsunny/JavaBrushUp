package hashset__ex;

import java.util.*;

public class IteratorEx1 {

	public static void main(String[] args) {
		HashSet<String> set1 = new HashSet<>();
		
		set1.add("�̼���");
		set1.add("�念��");
		set1.add("������");
		set1.add("�庸��");
		set1.add("��âȣ");
		
		// �� �׸��� �ϳ��� ������ �ݺ������� ó��
		Iterator it = set1.iterator();
		
		while(it.hasNext()) {  // ������ �о�� �׸��� �ִ��� Ȯ��
			String str = (String)it.next();
			System.out.println(str);
		}
		
	}

}
