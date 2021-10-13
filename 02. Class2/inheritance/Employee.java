package inheritance;

public class Employee {
	
	public static long baseSalary = 10000;
	
	public long getSalary() {
		return baseSalary;
	}
}

class Manager extends Employee {
	
	public long getSalary() {
		return baseSalary + 20000;
	}
}

class Clerk extends Employee {
	
	public long getSalary() {
		return baseSalary + 10000;
	}
}
