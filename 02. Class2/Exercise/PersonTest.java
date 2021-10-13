package Exercise;

import java.time.LocalDate;

abstract class Person {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	public String getName(){
		return name;
	}

	public abstract String getDescription();
}

class Employee extends Person {
	private int salary;   // ���޿�
	private LocalDate hireDay;  //�Ի���
	
	public Employee(String name, int salary, int year, int month, int day) {
		super(name);
		this.salary = salary;
		hireDay = LocalDate.of(year, month, day);
	}
	public int getSalary() {
		return salary;
	}
	public LocalDate getHireDay() {
		return hireDay;
	}
	public String getDescription() {
		return "�޿� "+salary+"�� �޴� ����";
	}	
	public void raiseSalary(int byPercent) {
		int raise = salary * byPercent / 100;
		salary += raise;
	}

}

class Student extends Person {
	private String major;
	
	public Student(String name, String major) {
		super(name);
		this.major = major;
	}
	
	public String getDescription() {
		return "������ "+major+"�� �л�";
	}
}


public class PersonTest {

	public static void main(String[] args) {
		Person[] people = new Person[2];
		
		people[0] = new Employee("�ƹ���",50000, 2005, 10, 1);
		people[1] = new Student("�念��","��ǻ�Ͱ���");
		
		
		for (Person p : people) {
			System.out.println(p.getName()+", "+p.getDescription());
		}

	}

}
