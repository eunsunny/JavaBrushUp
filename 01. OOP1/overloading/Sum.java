package overloading;
/*
 * 첫번째 sum() : 2개의 정수값을 더해서 반환하는 메소드
 * 두번째 sum() : 3개의 정수값을 더해서 반환하는 메소드
 * 세번째 sum() : 2개의 double 타입의 매개변수를 더해서 반환하는 메소드
 */

class Sum1 {
	
	public int sum(int a, int b) {
		return a+b;
	}
	public int sum(int a, int b, int c) {
		return a+b+c;
	}
	public double sum(double a, double b) {
		return a+b;
	}
	
}

public class Sum {

	public static void main(String[] args) {
		
		Sum1 s = new Sum1();
		
		int sum1 = s.sum(10, 20);
		int sum2 = s.sum(10, 20, 30);
		double dd = s.sum(10.7, 20.3);
		
		System.out.println("첫번째 "+sum1);
		System.out.println("두번째 "+sum2);
		System.out.println("세번째 "+dd);

	}

}
