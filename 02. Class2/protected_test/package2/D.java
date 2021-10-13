package protected_test.package2;

import protected_test.package1.A;
/*
 * 다른 패키지에 있는 A의 protected 멤버는 상속관계(자식클래스)에 있으므로 사용 가능함.
 */
public class D extends A {
	// 생성자
	public D() {
		//A a = new A();
		super();
		this.field = "value";
		this.method();
	}

}
