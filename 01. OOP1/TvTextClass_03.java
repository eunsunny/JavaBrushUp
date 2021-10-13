
class Tv {
	// 필드
	String color;
	boolean power;
	int channel;
	
	void method() {
		channel = 5; 
	}
	
	// java 컴파일러가 번역시에 기본생성자를 자동 생성함.
	// 다음과 같은 생성자가 자동 생성됨.
	// public Tv() { } 매개변수가 없이 클래스명으로만 만들어진것을 기본생성자라 한다.
}

public class TvTextClass_03 {

	public static void main(String[] args) {
		Tv tel = new Tv(); // 객체 생성 , new Tv(); <- 생성자
		
		System.out.println("현재 채널: "+tel.channel);
		
		tel.channel = 7; // 객체.특성값 = 리터럴;; <- 외부 클래스이기 때문
		
		System.out.println("변경된 채널: "+tel.channel);

	}

}
