package instance_static;

public class MemberCall {
	int iv = 10; // 인스턴스 변수
	static int cv = 20; // 스테틱 변수
	
	
	// 클래스 선언시에 메모리에 로드
	static void staticMethod1() {
		System.out.println(cv);   // 스테틱 변수 사용 불가능
		//System.out.println(iv);   // 인스턴스 변수 사용 불가능
		// 스테틱메서드에서 인스턴스 변수를 사용하려면 객체를 생성해야함
		MemberCall m2 = new MemberCall();
		System.out.println(m2.iv);
	}
	
	// 객체 생성시에 메모리에 로드
	// 인스턴스 메소드를 호출한다는 것은 이미 인스턴스가 민들어진 상태임.
	void instanceMethod1() {
		System.out.println(cv);   // 스테틱 변수 사용 가능
		System.out.println(iv);   // 인스턴스 변수 사용 가능
	}
	
	// 클래스 선언시에 메모리에 로드
	static void staticMethod2() {
		staticMethod1();
		//instanceMethod1();  // 사용하려면 객체를 만든 후 사용 가능함.
		// 사용하려면 객체를 만들어 주어야 함.
		MemberCall m1 = new MemberCall();
		m1.instanceMethod1();
	}
	
	// 객체생성시에 메모리에 로드
	void instanceMethod2() {
		staticMethod1(); // static 메소드 사용가능
		instanceMethod1(); // 객체가 만들어진 후이므로 인스턴스 메소드 사용 가능
	}

	public static void main(String[] args) {
		// static 매소드 호출
		MemberCall.staticMethod2();
		
		// 인스턴스 메소드 사용
		MemberCall mc = new MemberCall();
		mc.instanceMethod2();
		
		//print(); //main()은 static 메소드이므로 인스턴스 메소드 호출 불가능
	}
	// 인스턴스 메소드
	void print() {
		System.out.println("결과를 출력합니다.");
		
	}

}
