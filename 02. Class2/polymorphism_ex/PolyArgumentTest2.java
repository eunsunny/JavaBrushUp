package polymorphism_ex;

//구매자 클래스
//구입한 제품의 목록을 저장 기능 포함
class Buyer2 {
	int money = 50000;
	int bonusPoint = 0;
	Product[] items = new Product[10];  // 구입한 제품을 저장하는 배열
	int index = 0;
	
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
			
			// 구매한 제품을 구매목록에 추가
			items[index++] = p; 	// 먼제 p의 내용을 저장한 후에 index를 증가시킨다
									// index++; 로 해도됨
	}
	
	// 자신이 구매한 제품 목록 보는 기능
	void summary() {
		String itemList = "";
		int sum = 0;
		
		for (int i=0; i<items.length; i++) {
			if(items[i] == null) break;     // 구매한 제품의 목록이 없으면 for문 종료
			itemList += items[i] + ",";  // item[i] -> item[i].toString 과 동일 
			sum += items[i].price;
		}
		System.out.println("구매한 제품 목록은 "+itemList+"입니다.");
		System.out.println("구매한 제품의 총 금액은 "+sum+"입니다.");
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
