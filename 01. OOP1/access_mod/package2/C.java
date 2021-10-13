package access_mod.package2;

//import access_mod.package1.B;
import access_mod.package1.A;

public class C {
//	// A a;  // 다른 패키지내의 클래스는 사용할 수 없음
//	B b;  // 다른 패키지의 클래스를 사용하려면 import 해야함.
	
	public void c() {
		A a = new A();
		a.field1 = 10;
		// a.field2 = 10; // 다른 패키지 내의 default 멤버는 사용할 수 없음
		// a.field3 = 10;  // private 이므호 사용할 수 없음.
		
		a.method1();   // 위에랑 동일
		// a.method2();
		// a.method3();
		
	}
 
}
