package inheritance;

public class StudentTest {

	public static void main(String[] args) {
		Student st1 = new Student("ȫ�浿", "1234567-1234567", 100);
		
		System.out.println("�̸�: "+st1.getName());
		System.out.println("�ֹι�ȣ: "+st1.getSsn());
		System.out.println("�й�: "+st1.getStudNo());
		
		System.out.println(st1.toString());

	}

}
