package arraylist_ex;

import java.util.*;  // *�� ��� ��ƿ �Žñ� �����ִٴ°�

public class AsListExmple {

	public static void main(String[] args) {
		String[] names = {"ȫ�浿", "�̼���","������"};
		
		//�迭�� ����Ʈ�� ��ȯ
		List<String> list1 = Arrays.asList(names);
		System.out.println("list1="+list1);  // ���ڹ迭������ ��� ����

	}

}
