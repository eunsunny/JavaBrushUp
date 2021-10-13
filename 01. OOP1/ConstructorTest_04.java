/*
 * 모든 클래스에는 반드시 하나 이상의 생성자가 있어야 한다.
 */
class Data1 {
	int value;
	
}

class Data2 {
	int value1;
		
	// 생성자 : 매개변수가 있는 생성자
	Data2(int x) { 
		value1 = x;
	}
	
	//Data2() { }
}

public class ConstructorTest_04 {

	public static void main(String[] args) {
		Data1 d1 = new Data1();  // 컴파일러가 기본생성자를 자동으로 생성했기 떄문에 문제없음
		
		//Data1 d2 = new Data2();  //오류가 나는 이유 : 이미 생성자가 존배하면 컴파일러는 다시 생성자를 추가하지 않는다.
		

	}

}
