package inheritance;

// 부모클래스
class Tv {
	boolean power;   // 전원상태
	int channel;    //채널번호
	
	//메소드
	void power() {
		power = !power;
	}
	
	void channel1Up() {
		++channel;
	}

	void channel1Down() {
		--channel;
	}
}

//자손클래스 정의
class CaptionTv extends Tv {
	boolean caption;     //캡션의 상태  -> 캡션이라는 멤버 추가, 
	
	// 캡션보기
	void displayCaption(String text) {
		//캡션의 상태에 따라 text가 보이기도 하고 안보이기도 한다.
		if (caption) {  //캡션이 트루면 실행, 아니면 다음으로넘겨짐
			System.out.println(text);
		}
	}
}

public class CaptionTvTest {

	public static void main(String[] args) {
		CaptionTv tv1 = new CaptionTv();  // 캡션 티비의 객체선언, 위에 기능 사용이 가능하다는 것
		
		tv1.channel = 10;   // 티비1이라는 객체에 선언된 멤버변수
		tv1.channel1Up();
		
		System.out.println(tv1.channel);
		
		tv1.displayCaption("캡션기능 테스트....");  //boolean(boolean caption; 으로 선언되어있음)은 기본이 false라서 거짓이라 안나오는 것
		tv1.caption = true;
		
		tv1.displayCaption("캡션이 보이나요?");
	}

}
