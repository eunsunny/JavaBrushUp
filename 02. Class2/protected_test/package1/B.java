package protected_test.package1;

public class B {
	public void method() {
		A a = new A();    // 같은 패키지에서 Protected 생성자 사용 가능
		a.field = "value";
		a.method();
	}

}
