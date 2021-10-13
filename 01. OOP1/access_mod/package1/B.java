package access_mod.package1;

/*
 *  같은 패키지 내에서 다른 클래스의 멤버 사용
 */

public class B {
//	A a = new A();    // default 제어자가 적용됨.(아무것도 지정하지 않으면 default)
//	
//	public static void main(String[] args) {
//		A a = new A();
//		a.aa = 0;
//		a.a1 = 10; }
	
	public B() {
		A a = new A();   // 같은 패키지내의 클래스이므로  사용 가능
		a.field1 = 10;   // public
		a.field2 = 10;   // default
 		// a.field3 = 10;   // private 은 사용 불가능
		
		a.method1();   // public
		a.method2();   // default
		// a.method3();   // private 은 사용 불가능 (인스턴스와 메소드 동일함)
	}

}
