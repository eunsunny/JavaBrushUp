package inheritance;

public class People {
	private String name;
	private String ssn; //�ֹι�ȣ
	
	public People(String name, String ssn) {  //������ٰ� �ݵ�� �����������
		this.name = name;
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
}

class Student extends People {
	private int StudNo;
	
	public Student(String name, String ssn, int StudNo) {
		super(name, ssn);
		this.StudNo = StudNo;
	}

	public int getStudNo() {
		return StudNo;
	}

	public void setStudNo(int studNo) {
		StudNo = studNo;
	}
	public String toString() {
		return "[Student] studno="+StudNo;
	}
}


