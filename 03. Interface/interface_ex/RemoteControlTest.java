package interface_ex;

public class RemoteControlTest {

	public static void main(String[] args) {
		RemoteControl rc;  // �������̽��� Ÿ������ ���
		rc = new Tv();
		rc.turnOn();
		rc.setVolume(9);
		rc.setMute(true);
		
		rc = new Audio();  // ������� ��ü�� rc�� ��
		rc.turnOn();
		rc.setVolume(8);
		rc.setMute(false);
		
		RemoteControl.changeBattery();

	}

}
