package hashset__ex;

import java.util.*;

class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name+":"+age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person tmp = (Person)obj;
			// �̸��� ���̰� ��� ������ true�� ������
			return tmp.name.equals(name) && (tmp.age == age);
		} else {
		return false;
		}
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
	
	
}

public class PersonTest {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add("Hello");
		set.add("Hello");
		
		System.out.println("set="+set);
		
		//PersonŬ������ equals()�� hashCode()�� �����Ǿ� ���������� �Ʒ��� Person ��ü�� ������ �����ͷ� �Ǵ����� ����
		
		set.add(new Person("ȫ�浿", 25));
		set.add(new Person("ȫ�浿", 25));
		
		System.out.println("set="+set);

	}

}
