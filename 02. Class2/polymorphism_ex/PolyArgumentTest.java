package polymorphism_ex;
//���δ�Ʈ Ŭ������ ���� �P��

// ������ǰ Ŭ����
//class Product {
//	int price;  // ��ǰ����
//	int bonusPoint; // ��ǰ�� ���ʽ� ����Ʈ
//	
//	Product(int price) {
//		this.price = price;  // ������ǰ�� ���� ����
//		bonusPoint = (int)((double)price/10.0);  // ���ʽ� ����Ʈ�� ��ǰ������ 10%
//	}
//}
//
//class Tv extends Product {
//	Tv() {
//		super(10000);   // TV������ 1�������� ����, super�� ����Ͽ� �θ� ���� ȣ��
//	}
//	
//	public String toString() {
//		return "Tv";
//	}
//}
//
//class Computer extends Product {
//	Computer() {
//		super(5000);
//	}
//	public String toString() {
//		return "Computer";
//	}
//}
//
//class Audio extends Product {
//	Audio() {
//		super(3000);		
//	}
//	public String toString() {
//		return "Audio"+"(����:"+price+")";  // �� ��ǰ�� �ݾ��� ǥ�����ٶ�
//}
//}
	
//������ Ŭ����
class Buyer {
	int money = 50000;  // ���� ������ �ִ� ��
	int bonusPoint = 0;  // ���� ���ʽ� ����Ʈ
	
	// ���Ÿ� �� �� �ִ� �޼ҵ�
	// TV, Computer, Audio  ��� ��ǰ ���� ����
	void buy(Product p) {   // (Product p) -> Product p = new Computer / 
		if (money < p.price) {   // �� ������ ���� ��� �Ʒ��� sysout ���
			System.out.println("�ܾ��� �����Ͽ� ��ǰ�� ������ �� �����ϴ�."); 
			return; // ��ǰ�� ������ �������� �ٸ� �׼Ǿ��� ���� // �� ������ ������ ������ �־�� ���ļ� ����
		} 
			money -= p.price; // ������ �ִ� ������ ��ǰ�� �ݾ��� ���ش�.
			bonusPoint += p.bonusPoint;   // ��ǰ�� ���ʽ� ������ ���� ���ʽ� ������ �����ش�. �����ִ� �Ŵϱ� �ٸ� �׼� �� �ʿ����
			System.out.println(p+"�����Ͽ����ϴ�.");  // p = p.toString() 
												  // ���δ�Ʈ������ ����Ʈ���� ������ ������ �޼ҵ忡 ����Ʈ���� �ֱ⶧���� 
												  //p�� �ָ� ������ �������� Ŭ����(���δ�Ʈ)�� �µ��� ����� ��
	}
}

public class PolyArgumentTest {

	public static void main(String[] args) {
		Buyer buyer = new Buyer();   // ������ ����, ���̾ ������� �����ϱ⋚���� ��ü�����ʿ�
		
		Tv tv1 = new Tv();  //Tv��� ��ü�� �Ѱ���
		buyer.buy(tv1);  
		
		buyer.buy(new Computer()); // ������ ��ü�� ���̶�� �ŰԺ����� �ٷ� ���� �� �ִ�.
		buyer.buy(new Audio());
		
		System.out.printf("�������� ���� ���� %d�Դϴ�.\n", buyer.money);
		System.out.printf("�������� ���ʽ�����Ʈ�� %d�Դϴ�.\n", buyer.bonusPoint);
		
		

	}

}
