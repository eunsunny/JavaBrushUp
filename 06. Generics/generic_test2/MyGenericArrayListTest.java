package generic_test2;

public class MyGenericArrayListTest {

	public static void main(String[] args) {
		MyGenericArrayList<String> strList = new MyGenericArrayList<String>();  // 10���� �׸��� �� �� �ִ� ������ �������
		// <String>�̶�� ���ʸ�Ÿ���� �����߱� ������ String�ܿ��� ���� �Ұ���, Ÿ�� Ȯ�ο�
		
		strList.add("alpha");
		strList.add("beta");
		
		for(int i=0; i<strList.size(); i++) {
			String str = (String)strList.get(i); 
			System.out.println(str);
		}
		
		// ���ڸ� ����
		//strList.add(Integer.valueOf(123));  // Generic Ÿ���� String�̹Ƿ� ���ڴ� ���� �Ұ���

	}

}
