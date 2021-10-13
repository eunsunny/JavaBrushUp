package polymorphism_ex;
//������ǰ Ŭ����
class Product {
	int price;  // ��ǰ����
	int bonusPoint; // ��ǰ�� ���ʽ� ����Ʈ

	Product(int price) {
		this.price = price;  // ������ǰ�� ���� ����
		bonusPoint = (int)((double)price/10.0);  // ���ʽ� ����Ʈ�� ��ǰ������ 10%
	}
}

class Tv extends Product {
	Tv() {
		super(10000);   // TV������ 1�������� ����, super�� ����Ͽ� �θ� ���� ȣ��
	}

	public String toString() {
		return "Tv"+"(����:"+price+")";  // �� ��ǰ�� �ݾ��� ǥ�����ٶ�, +"(����:"+price+")" �̰Ż��� ������ �ȳ���
	}
}

class Computer extends Product {
	Computer() {
		super(5000);
	}
	public String toString() {
		return "Computer"+"(����:"+price+")";
	}
}

class Audio extends Product {
	Audio() {
		super(3000);		
	}
	public String toString() {
		return "Audio"+"(����:"+price+")";
	}
}
