package arraylist_ex;

import java.util.*;

public class BoardTest {

	public static void main(String[] args) {
		ArrayList<Board> list1 = new ArrayList();
		
		list1.add(new Board("����1", "����1", "�ۼ���1"));
		list1.add(new Board("����2", "����2", "�ۼ���2"));
		list1.add(new Board("����3", "����3", "�ۼ���3"));
		list1.add(new Board("����4", "����4", "�ۼ���4"));
		list1.add(new Board("����5", "����5", "�ۼ���5"));
		
		for(int i=0; i<list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		list1.remove(2);  //������ ��ġ�� �׸� ����, �ѹ� �����Ǹ� ��ĭ�� �������� ������ �ٽ� �Ű��� 0���� ����
		list1.remove(3);
		
		System.out.println("�������� ���:");
		for(int i=0; i<list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
	}
	

}
