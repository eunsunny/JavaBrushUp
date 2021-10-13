package polymorphism_ex;
//프로덕트 클래스로 따로 뻇음

// 전자제품 클래스
//class Product {
//	int price;  // 제품가격
//	int bonusPoint; // 제품의 보너스 포인트
//	
//	Product(int price) {
//		this.price = price;  // 전자제품의 가격 설정
//		bonusPoint = (int)((double)price/10.0);  // 보너스 포인트는 제품가격의 10%
//	}
//}
//
//class Tv extends Product {
//	Tv() {
//		super(10000);   // TV가격을 1만원으로 설정, super를 사용하여 부모 변수 호출
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
//		return "Audio"+"(가격:"+price+")";  // 각 제품의 금액을 표시해줄때
//}
//}
	
//구매자 클래스
class Buyer {
	int money = 50000;  // 고객이 가지고 있는 돈
	int bonusPoint = 0;  // 고객의 보너스 포인트
	
	// 구매를 할 수 있는 메소드
	// TV, Computer, Audio  모든 제품 구매 가능
	void buy(Product p) {   // (Product p) -> Product p = new Computer / 
		if (money < p.price) {   // 이 공식이 참일 경우 아래의 sysout 출력
			System.out.println("잔액이 부족하여 제품을 구매할 수 없습니다."); 
			return; // 제품을 구해할 수없으니 다른 액션없이 리턴 // 이 이프를 쓰려면 리턴을 넣어야 거쳐서 실행
		} 
			money -= p.price; // 가지고 있는 돈에서 제품의 금액을 뺴준다.
			bonusPoint += p.bonusPoint;   // 제품의 보너스 점수를 고객의 보너스 점수에 더해준다. 더해주는 거니까 다른 액션 할 필요없음
			System.out.println(p+"구입하였습니다.");  // p = p.toString() 
												  // 프로덕트에서는 투스트링이 없지만 각각의 메소드에 투스트링이 있기때문에 
												  //p를 주면 각각의 설정해주 클래스(프로덕트)에 맞도록 출력이 됨
	}
}

public class PolyArgumentTest {

	public static void main(String[] args) {
		Buyer buyer = new Buyer();   // 구매자 생성, 바이어가 뭘샀느지 봐야하기떄문에 객체생성필요
		
		Tv tv1 = new Tv();  //Tv라는 객체를 넘겨줌
		buyer.buy(tv1);  
		
		buyer.buy(new Computer()); // 생성된 객체를 바이라는 매게변수를 바로 넣을 수 있다.
		buyer.buy(new Audio());
		
		System.out.printf("구매자의 남은 돈은 %d입니다.\n", buyer.money);
		System.out.printf("구매자의 보너스포인트는 %d입니다.\n", buyer.bonusPoint);
		
		

	}

}
