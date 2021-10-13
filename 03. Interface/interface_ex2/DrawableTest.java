package interface_ex2;

public class DrawableTest {

	public static void main(String[] args) {
		Drawable[] shape = new Drawable[3];
		
		shape[0] = new Circle(10,10,15);
		shape[1] = new Circle(50,50,100);
		shape[2] = new Rectangle(100,50,200,150);
				
		for(Drawable s : shape) {
			s.draw(Drawable.GREEN);
		}
				
		
//		Drawable dr;
//		
//		dr = new Circle(2,4,5);
//		dr.draw(3);
//		
//		dr = new Rectangle(2,2,4,4);
//		dr.draw(5);
	

	}

}
