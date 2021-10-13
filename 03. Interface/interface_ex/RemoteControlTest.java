package interface_ex;

public class RemoteControlTest {

	public static void main(String[] args) {
		RemoteControl rc;  // 인터페이스르 타입으로 사용
		rc = new Tv();
		rc.turnOn();
		rc.setVolume(9);
		rc.setMute(true);
		
		rc = new Audio();  // 오디오의 객체가 rc로 들어감
		rc.turnOn();
		rc.setVolume(8);
		rc.setMute(false);
		
		RemoteControl.changeBattery();

	}

}
