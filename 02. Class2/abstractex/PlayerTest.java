package abstractex;

abstract class Player {   //추상 -> 자체적으로 객체 생성 불가
	int currentPos;  // 현재 재생위치
	boolean pause;   // 일시정지 상태 저장
	
	Player() {
		
	}
	
	abstract void play(int pos);   // 추상 메서드
	
	abstract void stop();    // 추상메서드
	
	void pause() {
		if (pause) {
			pause = false;  // 일시정지 해제
			play(currentPos);  // 현재상태에서 플레이 하도록 하는것
		} else {
			pause = true;   // 일시정지
			stop();
		}
		
	}
}

class CdPlayer extends Player {  // 추상메서드는 구체적으로 구현이 불가하기떄문에 상속으로 해서 구현시켜줘야 실행가능

	@Override
	void play(int pos) {
		currentPos = pos;
		System.out.printf("CD 플레이어가 %d 트랙을 재생합니다.\n", pos);
		
	}

	@Override
	void stop() {
		System.out.println("CD 플레이어의 재생을 중지합니다.");
	}
	
	void nextTrack() {
		if(!pause) {
			currentPos++;
			System.out.printf("CD 플레이어가 %d 트랙을 재생합니다.\n", currentPos);
		} else {
			System.out.println("CD 플레이어가 재생 중이 아닙니다.");
		}
	}
	
	void prevTrack() {
		if(!pause && currentPos>1) {
			currentPos--;
			System.out.printf("CD 플레이어가 %d 트랙을 재생합니다.\n", currentPos);
		} else {
			System.out.println("CD 플레이어가 재생 중이 아닙니다.");
		}
	}
	
}

public class PlayerTest {

	public static void main(String[] args) {
		//Player p = new Player();   // player는 추상클래스 이므로 객체생성 불가능
		CdPlayer cdp = new CdPlayer();
		
		cdp.play(1);
		cdp.stop();
		cdp.nextTrack();
		cdp.prevTrack();
	}

}
