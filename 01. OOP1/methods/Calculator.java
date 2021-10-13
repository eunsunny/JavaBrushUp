package methods;
/*
 *  평균을 구하는 계산기
 */
public class Calculator {
//	public Calculator() { // 자동으로 생성되기 떄문에 안써도됨
//		
//	}
	
	int plus(int x, int y) { // 더하는 부분은 plus라는 메소드 사용
		int result = x + y;
		return result; // 기능을 수행하고 결과를 윗쪽으로 올려줌, 한번 하고 위로 올려주고 빠져버림
		
		// result = x * y; // 넣어도 소용없음
	}
	
	// 평균을 계산하는 메소드
	double avg(int a, int b) {  // 평균에 대한 매소드 avg
		double sum = plus(a, b); //위에 plus라는 기능이 있기 떄문에 사용 a+b, 같은 클래스에서는 객체이름 넣어줄 필요가 없음
		//a -> x, b -> y 복사
		double result = sum / 2;
		return result;	// 타입이 동일해야함	double avg 타입 = return result
	}
	
	void execute() {  // <= 요거만 호출해 주면 자동으로 파파팍 됨
		double result = avg(7, 10); // 7 -> a -> x, 10 -> b -> y 로 들어감
		// 결과 출력
		resultPrint("실행결과: "+result); // 문자열 + 임의값은 = 문자열
	}
	
	// 실행결과 출력하는 메소드
	void resultPrint(String str) {  // 문자열로 들어감, 위의 resultPrint 값이 여기로 들어감, resultPrint는 프로그래머가 만든것
		System.out.println(str);
		
	}
	

}



