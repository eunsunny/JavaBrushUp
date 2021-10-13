package inheritance;

public class EmployeeTest {

	public static void main(String[] args) {
		Manager a = new Manager();
		Clerk b = new Clerk();
//		long result = a.getSalary();
//		long result2 = b.getSalary();
		System.out.println("매니저 급여: "+a.getSalary());
		System.out.println("점원 급여: "+b.getSalary());

	}

}
