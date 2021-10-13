package polymorphism_ex;
//전제제품 클래스
class Product {
	int price;  // 제품가격
	int bonusPoint; // 제품의 보너스 포인트

	Product(int price) {
		this.price = price;  // 전자제품의 가격 설정
		bonusPoint = (int)((double)price/10.0);  // 보너스 포인트는 제품가격의 10%
	}
}

class Tv extends Product {
	Tv() {
		super(10000);   // TV가격을 1만원으로 설정, super를 사용하여 부모 변수 호출
	}

	public String toString() {
		return "Tv"+"(가격:"+price+")";  // 각 제품의 금액을 표시해줄때, +"(가격:"+price+")" 이거빼면 가격은 안나옴
	}
}

class Computer extends Product {
	Computer() {
		super(5000);
	}
	public String toString() {
		return "Computer"+"(가격:"+price+")";
	}
}

class Audio extends Product {
	Audio() {
		super(3000);		
	}
	public String toString() {
		return "Audio"+"(가격:"+price+")";
	}
}
