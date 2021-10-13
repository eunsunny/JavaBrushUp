package instance_static;

public class InitBlock {
	static int[] arr = new int[10];
	
	static {
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10)+1;
		}
	}

	public static void main(String[] args) {
		for(int i=0; i<arr.length; i++) {
			System.out.printf("arr[%d] = %d\n", i, arr[i]);
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.printf("arr[%d] = %d\n", arr[i], arr[i]);
		}

	}

}