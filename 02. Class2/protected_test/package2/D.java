package protected_test.package2;

import protected_test.package1.A;
/*
 * �ٸ� ��Ű���� �ִ� A�� protected ����� ��Ӱ���(�ڽ�Ŭ����)�� �����Ƿ� ��� ������.
 */
public class D extends A {
	// ������
	public D() {
		//A a = new A();
		super();
		this.field = "value";
		this.method();
	}

}
