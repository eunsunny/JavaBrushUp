package overloading;

public class SumTest {

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
