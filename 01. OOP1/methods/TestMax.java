package methods;

class Max{
	//2개 수 중, 더 큰 값을 반환하는 메소드
	int getMax(int a, int b) {
		if (a > b) 
			return a;   // 여기만 있으면 오류남 if문이 false일때 실행할 값이 없어서!
		else
			return b;  // 모든 조건에 대해서 리턴을 해야한다.
		
		// 리턴문 이후에 실행문이 오면 "Unreachable code" 컴파일 오류가 발생한다.
	}
	
	int add(int a, int b) {
		return a+b;
	}
	
	long add(int a, long b) { 
		return (long)a+b;
	}
}

public class TestMax {

	public static void main(String[] args) {
		Max max = new Max();
		
		int result = max.getMax(8, 10);

	}

}
