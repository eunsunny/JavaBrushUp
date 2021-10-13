package interface_ex;

public interface RemoteControl {
	// ���
	public static int MAX_VOLUME = 10;   //public static  �����Ѱ���
	int MIN_VOLUME = 0;  //public static  �����Ѱ���, ���̳ξ�� ������ ���
	
	//�߻�޼���
	public abstract void turnOn();
	void turnOff();   //public abstract �� ������
	void setVolume(int volume);  //public abstract �� ������
	
	//���� 1.8 ���� interface�� default �޼ҵ� �߰� ����
	
	default void setMute(boolean mute) {
		if(mute){ //��Ʈ�� Ʈ���̸� ����ó��
			System.out.println("������ ó���մϴ�.");
		} else {
			System.out.println("������ �����մϴ�.");
		}
	}
	
	//1.8 ���� interface�� static method �߰� ����
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}



