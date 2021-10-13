package hachmap_ex;

import java.util.*; 

class Student {
	private int sno;
	private String name;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(sno, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student st = (Student)obj;
			
			return (sno==st.sno) && (name.equals(st.name));
		} else {
		return false;
		}
	}
	
}

public class HashMapEx2 {

	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<>();
		
		map.put(new Student(1, "ȫ�浿"), 95);
		map.put(new Student(1, "ȫ�浿"), 95);

		System.out.println(map.toString());
	}

}
