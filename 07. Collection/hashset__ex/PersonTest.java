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
			// 이름과 나이가 모두 같으면 true를 리턴함
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
		
		//Person클래스에 equals()와 hashCode()가 구현되어 있지않으면 아래의 Person 객체는 동일한 데이터로 판단하지 못함
		
		set.add(new Person("홍길동", 25));
		set.add(new Person("홍길동", 25));
		
		System.out.println("set="+set);

	}

}
