package inheritance;

// �θ�Ŭ����
class Tv {
	boolean power;   // ��������
	int channel;    //ä�ι�ȣ
	
	//�޼ҵ�
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

//�ڼ�Ŭ���� ����
class CaptionTv extends Tv {
	boolean caption;     //ĸ���� ����  -> ĸ���̶�� ��� �߰�, 
	
	// ĸ�Ǻ���
	void displayCaption(String text) {
		//ĸ���� ���¿� ���� text�� ���̱⵵ �ϰ� �Ⱥ��̱⵵ �Ѵ�.
		if (caption) {  //ĸ���� Ʈ��� ����, �ƴϸ� �������γѰ���
			System.out.println(text);
		}
	}
}

public class CaptionTvTest {

	public static void main(String[] args) {
		CaptionTv tv1 = new CaptionTv();  // ĸ�� Ƽ���� ��ü����, ���� ��� ����� �����ϴٴ� ��
		
		tv1.channel = 10;   // Ƽ��1�̶�� ��ü�� ����� �������
		tv1.channel1Up();
		
		System.out.println(tv1.channel);
		
		tv1.displayCaption("ĸ�Ǳ�� �׽�Ʈ....");  //boolean(boolean caption; ���� ����Ǿ�����)�� �⺻�� false�� �����̶� �ȳ����� ��
		tv1.caption = true;
		
		tv1.displayCaption("ĸ���� ���̳���?");
	}

}
