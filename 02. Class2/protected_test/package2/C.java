package protected_test.package2;

import protected_test.package1.A;

// package1에 있는 A 클래스와 상속관계가 아님
public class C {
	public void method() {
		/*
		A a = new A();   // A의 생성자는 protected 이므로 다른 패키지에서 사용 불가능, import 하더라도 안됌
		a.field = "value";  // 객체가 생성이 안되었으므로 사용 불가
		a.method();   // 마찬가지임
		*/
		
	}

}
