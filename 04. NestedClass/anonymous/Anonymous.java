package anonymous;

//익명클래스 대신 상속을 사용하는 경우
class SalaryMan extends Person{
	void work() {
		System.out.println("출근합니다.");
	}
	@Override
	void wake() {  //Person에서 정의된 것을 사용하는 것이 아니라 새로 선언해서 사용하겠다
		System.out.println("6시에 일어납니다.");
		work();
	}
}
public class Anonymous {  // 한번만 사용할 경우이며, 클래스명이 없는것임 -> 익명의 클래스
	// 필드의 초기값으로 익명의 클래스 대입
	// Person클래스를 상속받아 새로운 클래스를 작성한다는 의미
	Person field = new Person() { // 조상타입으로 선언해서
		void work() {
			System.out.println("출근합니다.");
		}

		@Override
		void wake() {  //Person에서 정의된 것을 사용하는 것이 아니라 새로 선언해서 사용하겠다
			System.out.println("6시에 일어납니다.");
			work();
		}
		
	}; // 필드 선언과 비슷하기 떄문에 ;을 붙혀줘야함
	
	//익명의 클래스 대신 SalaryMan 클래스 객체를 사용할 경우
	SalaryMan field2 = new SalaryMan();
	
	void method1() {
		// 로컬변수로 익명의 클래스 대입
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책합니다.");
			}

			@Override
			void wake() {
				System.out.println("8시에 일어납니다.");
				walk();
			}
		};
		
		localVar.wake();   // 익명의 클래스 사용 가능
				
	}
	
	void method2(Person person) {
		person.wake();
	}

}
