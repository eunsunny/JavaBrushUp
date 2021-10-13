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
		return "번호:" + stud_no + "\n이름:" + name + "\n나이:" + age;
	}
		
}

public class StudentTest {

	public static void main(String[] args) {
		ArrayList<Student> list1 = new ArrayList<Student>();  // 뒤쪽 <Student>는 생략해줘도 되지만 원래 붙이는 게 맞음
		
		list1.add(new Student(101, "홍길동", 25));
		list1.add(new Student(102, "이순신", 33));
		list1.add(new Student(103, "장영실", 29));
		
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
