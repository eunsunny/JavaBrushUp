package protected_test.package1;

public class B {
	public void method() {
		A a = new A();    // ���� ��Ű������ Protected ������ ��� ����
		a.field = "value";
		a.method();
	}

}
