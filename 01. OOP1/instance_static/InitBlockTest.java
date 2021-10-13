package instance_static;

public class InitBlockTest {

	// static 블럭
	static {
		System.out.println("static { }");
	}
	
	// 인스턴스 블럭
	{
		System.out.println("인스턴스 블럭 초기화");
	}
	
	public InitBlockTest() {
		System.out.println("생성자...");
	}
	
	int add(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		System.out.println("젓번째 InitblockTest 객체 생성");
		InitBlockTest bt = new InitBlockTest();
				
		System.out.println("두번째 InitblockTest 객체 생성");
		InitBlockTest bt2 = new InitBlockTest();
		// static 메소드 사용 예 
		int a = Math.abs(-1);
		
		// 인스턴스 메소드 사용 예
		InitBlockTest bt3 = new InitBlockTest();
		int result = bt3.add(10, 20);

	}

}