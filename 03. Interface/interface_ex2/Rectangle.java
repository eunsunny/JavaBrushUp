package interface_ex2;

public class Rectangle implements Drawable {
	private int x1, y1;
	private int x2, y2;
	private String[] colorName = {"", "RED","GREEN","BLUE","BLACK","WHITE"};

	public Rectangle(int x1, int y1, int x2, int y2) {
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
	}

	@Override
	public void draw(int color) {
		System.out.printf("왼쪽위의 좌표가(%d,%d) 오른쪽 아래의 좌표가 (%d,%d), 사각형의 색깔이 %s인 사각형을 그립니다.\n", x1,y1,x2,y2,colorName[color]);
	}

	public int getX1() {
		return x1;
	}

	public int getY1() {
		return y1;
	}

	public int getX2() {
		return x2;
	}

	public int getY2() {
		return y2;
	}

}
