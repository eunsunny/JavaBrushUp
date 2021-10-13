package inheritance;

class CarClass {
	public int speedLimit() {
		return 100;
	}
}

class Sonata extends CarClass {
	public int speedLimit() {
		return 150;
	}
}


public class OverrideTest {
	public static void main(String[] args) {
		Sonata car1 = new Sonata();
		
		int result = car1.speedLimit();
		
		System.out.println("Speed Limit´Â "+result);
	}

}
