package arraylist_ex;

import java.util.*;

class Student {
	private int stud_no;
	private String name;
	private int age;
	
	public Student(int stud_no, String name, int age) {
		this.stud_no = stud_no;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "��ȣ:" + stud_no + "\n�̸�:" + name + "\n����:" + age;
	}
		
}

public class StudentTest {

	public static void main(String[] args) {
		ArrayList<Student> list1 = new ArrayList<Student>();  // ���� <Student>�� �������൵ ������ ���� ���̴� �� ����
		
		list1.add(new Student(101, "ȫ�浿", 25));
		list1.add(new Student(102, "�̼���", 33));
		list1.add(new Student(103, "�念��", 29));
		
		for(Student st : list1) {
			System.out.println(st);
			System.out.println();
		}
//		
//		for(int i=0; i<list1.size(); i++) {
//			System.out.println(list1.get(i));
//		}

	}
	
}
