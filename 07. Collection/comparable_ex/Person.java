package comparable_ex;

/*
 * age값에 따라서 순서를 정한다.
 */

public class Person implements Comparable<Person> {
	private String name;
	private int age;  // 나중에 비교할때는 둘중 어느거로할지 기준을 잡아야함
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	/*
	 * obj =  새로 입력되는 값
	 * 현재 값이 작으면 -1 return
	 * 같으면 0 return
	 * 현재 값이 크면 1 return
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
