package Interface_polymorphism;

class Fighter extends Unit implements Fighterable {

	@Override
	public void move(int x, int y) {
		super.x = x;
		super.y = y;
		System.out.printf("������ (%d, %d)��ġ�� �̵��մϴ�.",x,y);
		
	}

	@Override
	public void attack(Unit u) {
		System.out.println("������ �����մϴ�.");
		
	}
	
}

public class FighterTest {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		
		if(f instanceof Unit) {
			// Unit u = f; 
			System.out.println("f�� ����Ŭ������ �ڼ��Դϴ�.");
		}
		
		if(f instanceof Fighterable) {
			// Fighterable ft = f ��밡��;
			System.out.println("Fighterable �������̽��� �����Ͽ����ϴ�.");
		}
		
		if(f instanceof Movable) {
			System.out.println("f�� Movable �������̽��� �����Ͽ����ϴ�.");
		}

	}

}
