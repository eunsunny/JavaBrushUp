package methods;

class Print {
	public void disp(char c) {
		System.out.println(c);
	}
	public void disp(char c, int num) {
		System.out.println("c="+c);
		System.out.println("num="+num);
		
	}
	public void disp(float f) {
		System.out.println("f="+f);
	}
	
}

public class OverloadingTest {

	public static void main(String[] args) {
		Print p = new Print();
		
		p.disp(120);

	}

}
