package anonymous;

public class AnonymousTest {

	public static void main(String[] args) {
		Anonymous an = new Anonymous();
		
		an.field.wake();
		
		an.method1();
		
		// 메소드의 매게변수로 익명의 클래스를 전달
		an.method2(new Person() {  // 익명의 클래스를 바로 만들어서 전달
			void study() {
				System.out.println("공부를 합니다.");
			}

			@Override
			void wake() {
				System.out.println("5시에 일어납니다.");
				study();
			}
			
		});

	}

}
