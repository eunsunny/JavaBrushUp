
class Parent {
	
}

class Child extends Parent {
	
}


public class InstanceOfExample {
	
	public static void method1(Parent parent) {
		if (parent instanceof Child) {
			Child child = (Child)parent;
			System.out.println("Child 타입으로 변환 성공");
		} else {
			System.out.println("Child 타입으로 변환 실패");
		}
	}
	public static void method2(Parent parent) {
		Child child = (Child)parent;
		System.out.println("method2: Child 타입으로 변환 성공");
	}

	public static void main(String[] args) {
		// polymorphism 예
		Parent p = new Child();
		method1(p);
		method2(p);
		
		Parent p2 = new Parent();  // 조상의 객체를 자손의 타입으로 좌지우지할 수 없음,
		method1(p2);
		method2(p2); //오류
		
		/* 원래의 객체가 부모냐 자손이냐에 따라 바꿀수 있느냐 없느냐 달라짐
		 * 	Parent p = new Child();
		 *  Child c = (Child)p;  //원래 생성된 객체가 차일드이면 참조변수를 차일드로 바꿀수 있지만
		 *  
		 *  Parent p = new Parent();
		 *  Child c = (Child)p; // 원래 생성된 객체가 패런트이기 떄문에 못바꿈
		 */

	}

}
