package interface_ex4;

public class ResizableCircle extends Circle implements Resizable {
	
	public ResizableCircle(double radius) {
		super(radius);
	}

	/*
	 * resize = 반지름값을 percent값만큼 증가
	 */
	
	@Override
	public double resize(int percent) {
		radius = radius + radius*(percent/100.0);
		return radius;
	}

}
