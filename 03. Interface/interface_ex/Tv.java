package interface_ex;

public class Tv implements RemoteControl {   //implements 사용한다는 것 주의, 부모자식 클래스가 되는것임
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("Tv를 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("Tv를 끕니다.");

	}

	@Override
	public void setVolume(int volume) {
			if (volume > RemoteControl.MAX_VOLUME) {
				this.volume = RemoteControl.MAX_VOLUME;
			} else if (volume < RemoteControl.MIN_VOLUME) {
				this.volume = RemoteControl.MIN_VOLUME;
			} else {
				this.volume =volume;
			} System.out.println("현재 Tv 볼륨: "+volume);
		}
	}
