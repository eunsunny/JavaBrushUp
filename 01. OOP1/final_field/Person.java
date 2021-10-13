package final_field;
// 독립적으로 실행안한다는 것
public class Person {
	final String nation = "Korea";
	final String ssn;  // 주민등록번호
	String name;   // 이름
	
	// 생성자 자동생성 알트 + n
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [nation=" + nation + ", ssn=" + ssn + ", name=" + name + "]";
	}
	
	
	
	

}
