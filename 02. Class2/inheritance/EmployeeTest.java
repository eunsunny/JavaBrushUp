package inheritance;

public class EmployeeTest {

	public static void main(String[] args) {
		Manager a = new Manager();
		Clerk b = new Clerk();
//		long result = a.getSalary();
//		long result2 = b.getSalary();
		System.out.println("�Ŵ��� �޿�: "+a.getSalary());
		System.out.println("���� �޿�: "+b.getSalary());

	}

}
