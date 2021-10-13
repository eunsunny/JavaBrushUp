package inheritance;

public class StudentTest {

	public static void main(String[] args) {
		Student st1 = new Student("홍길동", "1234567-1234567", 100);
		
		System.out.println("이름: "+st1.getName());
		System.out.println("주민번호: "+st1.getSsn());
		System.out.println("학번: "+st1.getStudNo());
		
		System.out.println(st1.toString());

	}

}
