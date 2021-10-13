package Interface_polymorphism;

class Fighter extends Unit implements Fighterable {

	@Override
	public void move(int x, int y) {
		super.x = x;
		super.y = y;
		System.out.printf("유닛이 (%d, %d)위치로 이동합니다.",x,y);
		
	}

	@Override
	public void attack(Unit u) {
		System.out.println("유닛을 공격합니다.");
		
	}
	
}

public class FighterTest {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		
		if(f instanceof Unit) {
			// Unit u = f; 
			System.out.println("f는 유닛클래스의 자손입니다.");
		}
		
		if(f instanceof Fighterable) {
			// Fighterable ft = f 사용가능;
			System.out.println("Fighterable 인터페이스를 구현하였습니다.");
		}
		
		if(f instanceof Movable) {
			System.out.println("f는 Movable 인터페이스를 구현하였습니다.");
		}

	}

}
