package abstractex;

abstract class Player {   //�߻� -> ��ü������ ��ü ���� �Ұ�
	int currentPos;  // ���� �����ġ
	boolean pause;   // �Ͻ����� ���� ����
	
	Player() {
		
	}
	
	abstract void play(int pos);   // �߻� �޼���
	
	abstract void stop();    // �߻�޼���
	
	void pause() {
		if (pause) {
			pause = false;  // �Ͻ����� ����
			play(currentPos);  // ������¿��� �÷��� �ϵ��� �ϴ°�
		} else {
			pause = true;   // �Ͻ�����
			stop();
		}
		
	}
}

class CdPlayer extends Player {  // �߻�޼���� ��ü������ ������ �Ұ��ϱ⋚���� ������� �ؼ� ����������� ���డ��

	@Override
	void play(int pos) {
		currentPos = pos;
		System.out.printf("CD �÷��̾ %d Ʈ���� ����մϴ�.\n", pos);
		
	}

	@Override
	void stop() {
		System.out.println("CD �÷��̾��� ����� �����մϴ�.");
	}
	
	void nextTrack() {
		if(!pause) {
			currentPos++;
			System.out.printf("CD �÷��̾ %d Ʈ���� ����մϴ�.\n", currentPos);
		} else {
			System.out.println("CD �÷��̾ ��� ���� �ƴմϴ�.");
		}
	}
	
	void prevTrack() {
		if(!pause && currentPos>1) {
			currentPos--;
			System.out.printf("CD �÷��̾ %d Ʈ���� ����մϴ�.\n", currentPos);
		} else {
			System.out.println("CD �÷��̾ ��� ���� �ƴմϴ�.");
		}
	}
	
}

public class PlayerTest {

	public static void main(String[] args) {
		//Player p = new Player();   // player�� �߻�Ŭ���� �̹Ƿ� ��ü���� �Ұ���
		CdPlayer cdp = new CdPlayer();
		
		cdp.play(1);
		cdp.stop();
		cdp.nextTrack();
		cdp.prevTrack();
	}

}
