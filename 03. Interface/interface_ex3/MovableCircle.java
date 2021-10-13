package interface_ex3;

public class MovableCircle extends MovablePoint implements Movable {
	
	private int radius;
	private MovablePoint center;

	public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
		super(x, y, xSpeed, ySpeed);
		this.radius = radius;
	}
	
	public String toString() {
		return "������ġ=("+x+","+y+")\nsXspeed="+xSpeed+" ySpeed="+ySpeed+"\n�̵���ġ"
				+x+","+y+"\n";
	}
	
	@Override
	public void moveUp() {
		y -= ySpeed;
	//	System.out.printf("�̵���ġ:%d, %d",x,y);
			
	}
	@Override
	public void moveDown() {
		y += ySpeed;
	//	System.out.printf("�̵���ġ:%d, %d",x,y);
		
	}
	@Override
	public void moveLeft() {
		x -= xSpeed;
	//	System.out.printf("�̵���ġ:%d, %d",x,y);
		
	}
	@Override
	public void moveRight() {
		x += xSpeed;
	//	System.out.printf("�̵���ġ:%d, %d",x,y);
		
	}

	

}
