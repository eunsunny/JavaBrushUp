package interface_ex2;

public class Circle implements Drawable {
	
	private int x;
	private int y;
	private double radius;
	private String[] colorName = {"", "RED","GREEN","BLUE","BLACK","WHITE"};
	
	public Circle(int x, int y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;	
	}

	@Override
	public void draw(int color) {
		System.out.println("("+x+","+y+")��ġ�� ������ "+radius+", ���� ������ "+colorName[color]+"�ο��� �׸��ϴ�.");

	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public double getRadius() {
		return radius;
	}
	

}
