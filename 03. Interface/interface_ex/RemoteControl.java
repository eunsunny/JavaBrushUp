package interface_ex;

public interface RemoteControl {
	// 상수
	public static int MAX_VOLUME = 10;   //public static  생략한거임
	int MIN_VOLUME = 0;  //public static  생략한거임, 파이널없어도 무조건 상수
	
	//추상메서드
	public abstract void turnOn();
	void turnOff();   //public abstract 가 생략됨
	void setVolume(int volume);  //public abstract 가 생략됨
	
	//버전 1.8 이후 interface에 default 메소드 추가 가능
	
	default void setMute(boolean mute) {
		if(mute){ //뮤트가 트루이면 무음처리
			System.out.println("무음을 처리합니다.");
		} else {
			System.out.println("무음을 해제합니다.");
		}
	}
	
	//1.8 이후 interface에 static method 추가 가능
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}



