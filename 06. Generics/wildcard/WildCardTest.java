package wildcard;

import java.util.*;  //*�� �� �����ϴ� ��

public class WildCardTest {

	//public static void printList(List<Object> lst) {
	public static void printList(List<?> lst) {  // �Ű������� wildcard�� ��ü
		for(Object obj:lst) {
			System.out.println(obj);
		}
	}
	public static void main(String[] args) {
		List<Object> objList = new ArrayList<Object>();  // ArrayList�� �ڹٿ��� �����ϴ� ���
		objList.add(Integer.valueOf(50));
		printList(objList);
		
		List<String> strList = new ArrayList<String>();
		strList.add("one");
		printList(strList);  // (ù���� ������Ʈ�� ���ʸ�������)��Ʈ�� Ÿ�����δ� �Ұ����ϴٴ� ������

	}

}
