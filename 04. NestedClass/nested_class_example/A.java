package nested_class_example;

// A : outer Class(외부에 있는거라 아우터)
public class A {
	public int b;

	A(){
		System.out.println("A객체가 생성됨.");
	}
	
	//인스턴스 멤버클래스
	class B {
		// 생성자
		B(){
			System.out.println("B객체가 생성됨.");
		}
		int fields1;  // 인스턴스 멤버
		// static int fields2; // 인스턴스 멤버 내에 사용불가능 왜?
		void method1() { }
		// static void method2{  } class B 자체가 인스턴스 메소드라 스테틱 메소드 선언 불가
	}
	
	//정적인멤버 클래스
	static class C {
		C() {
			System.out.println("C 객체가 생성됨.");
		}
		int field1;
		static int field2;
		void method1() { }
		static void method2() { }
	}
	
	void method() {
		//로컬클래스 - 메소드안에 선언된 클래스
		class D { // 일반적인 클래스 선언과 동일
			D(){	
				System.out.println("D객체가 생성됨.");
			}
			int field1;
			// static int field2;  스테틱 사용 불가능
			void method1() {  }
			//static void method() { }  스테틱 사용 불가능
		}
		
		D d = new D(); // class D는 메소드 안에있기 때문에 밖에서 사용 불가능
		d.field1 = 3;
		d.method1();
	}

}
