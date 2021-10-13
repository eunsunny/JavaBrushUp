package access_mod.package1;

public class A {
//	private int aa; // 같은 클래스 안에서만 사용 가능
//	public int a1;  // 어떤 클래스든지 사용 가능
	// 필드
	public int field1;
	int field2;   // default 멤버
	private int field3;
	
	// 생성자
	public A() {
		// 클래스 내부에서는 모든 종류의 멤버를 사용 가능
		field1 = 10;
		field2 = 10;
		field3 = 10;	
		
		// 클래스 내부에서는 모든 종류의 메소드를 사용 가능
		method1();
		method2();
		method3();
		
				
	}
	
	// 메소드
	public void method1() { }
	void method2() { }
	private void method3() { }

}
