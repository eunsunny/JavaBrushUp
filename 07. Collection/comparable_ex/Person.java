package comparable_ex;

/*
 * age���� ���� ������ ���Ѵ�.
 */

public class Person implements Comparable<Person> {
	private String name;
	private int age;  // ���߿� ���Ҷ��� ���� ����ŷ����� ������ ��ƾ���
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	/*
	 * obj =  ���� �ԷµǴ� ��
	 * ���� ���� ������ -1 return
	 * ������ 0 return
	 * ���� ���� ũ�� 1 return
	 */
	@Override
	public int compareTo(Person obj) {
		if (age < obj.age) {
			return -1;
		} else if(age == obj.age) {
			return 0;
		} else {
			return 1;
		}
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
