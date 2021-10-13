package nested_class_example;

public class Main {

	public static void main(String[] args) {
		A a = new A();   // 외부 클래스 객체 생성
		
		// 인스턴스 멤버 클래스 객체 생성
		// 멤버변수를 접근할때는 
		a.b = 10; // a라는 객체안에 b라는 변수를 어사인
		
		// 이렇게 사용하는데
		// 인스턴스 멤버 클래스 객체를 생성할 떄는
		A.B ab = a.new B(); // 이렇게 생성하면 내부 클래스에 대한 객체 생성
		ab.fields1 = 5;
		ab.method1(); // 인스턴스 변수, 메소드 다 사용 가능
		
		//static 멤버 클래스 객체
		A.C c = new A.C();  // A의 클래스명을 가지고 인스턴스 생성
		c.field1 = 5;
		c.method1();  // 인스턴스 변수, 메소드 다 사용 가능
		//static 멤버는 객체 생성 없이 사용 가능
		A.C.field2 = 3;
		A.C.method2();  // 객체 생성없이 사용
		
		// 로컬클래스 사용을 위해 메소드 호출
		a.method(); // 메소드안에 클래스가 선언되어 사용가능
		// 메소드 안에 필요한 값이 들어가면 a.method에서 불러와 출력 진행
//		D d = new D(); // class D는 메소드 안에있기 때문에 밖에서 사용 불가능
//		d.field1 = 3;
//		d.method1(); <- 위의 세줄이 A 클래스에 선언된 내용
		
	}

}
