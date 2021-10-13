package generic_test;

public class MyArrayListTest {

	public static void main(String[] args) {
		MyArrayList strList = new MyArrayList();  // 10���� �׸��� �� �� �ִ� ������ �������
		
		strList.add("alpha");
		//�⺻���� ���� �� ����,  byte/int/long ��, byte->Byte/int->Int/long-< Long �⺻��-> ���������� �ٲ�鼭 ���������� ���ڸ� ���� �� ����
		strList.add("beta");
		
		for(int i=0; i<strList.size(); i++) {
			String str = (String)strList.get(i);  // ���� ��Ʈ��Ÿ������ �� �־��� �۹���(�ʵ忡) Object��� �ص� ��Ʈ�� ���� �� ����
			System.out.println(str);
		}
		
		// ���ڸ� ����
		strList.add(Integer.valueOf(123));  // �Ű������� �Ѱ��ټ� ���� ������ Object ��¼�� ������ -> Integer.valueOf ���� ��� �⺻�� Ÿ���̶� �ȉ�, Object ��¼�� �ؾ���
		
		System.out.println("���� ���� �� ����:");
		for(int i=0; i<strList.size(); i++) {
			String str = (String)strList.get(i); // ���ڸ� String���� �ٲٷ��ϴ� �������°�
			System.out.println(str);
		}

	}

}
