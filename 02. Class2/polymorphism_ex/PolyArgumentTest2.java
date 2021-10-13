package polymorphism_ex;

//������ Ŭ����
//������ ��ǰ�� ����� ���� ��� ����
class Buyer2 {
	int money = 50000;
	int bonusPoint = 0;
	Product[] items = new Product[10];  // ������ ��ǰ�� �����ϴ� �迭
	int index = 0;
	
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
			
			// ������ ��ǰ�� ���Ÿ�Ͽ� �߰�
			items[index++] = p; 	// ���� p�� ������ ������ �Ŀ� index�� ������Ų��
									// index++; �� �ص���
	}
	
	// �ڽ��� ������ ��ǰ ��� ���� ���
	void summary() {
		String itemList = "";
		int sum = 0;
		
		for (int i=0; i<items.length; i++) {
			if(items[i] == null) break;     // ������ ��ǰ�� ����� ������ for�� ����
			itemList += items[i] + ",";  // item[i] -> item[i].toString �� ���� 
			sum += items[i].price;
		}
		System.out.println("������ ��ǰ ����� "+itemList+"�Դϴ�.");
		System.out.println("������ ��ǰ�� �� �ݾ��� "+sum+"�Դϴ�.");
	}
	
}

public class PolyArgumentTest2 {

	public static void main(String[] args) {
		Buyer2 buyer = new Buyer2();
		
		buyer.buy(new Tv());
		buyer.buy(new Audio());
		buyer.buy(new Computer());
		
		buyer.summary();

	}

}
