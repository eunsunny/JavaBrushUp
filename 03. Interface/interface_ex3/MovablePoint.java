package interface_ex3;

public class MovablePoint implements Movable {
	int x;  //x�� ��ǥ��
	int y;	//y�� ��ǥ��
	int xSpeed;	 //x������ �����̴� point ��
	int ySpeed;  //y������ �����̴� point ��
	
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	@Override
	public String toString() {
		return "������ġ=("+x+","+y+")\nsXspeed="+xSpeed+" ySpeed="+ySpeed+"\n�̵���ġ"
				+x+","+y+"\n";
	}

	@Override
	public void moveUp() {
		y -= ySpeed;

	}
	@Override
	public void moveDown() {
		y += ySpeed;
		
	}
	@Override
	public void moveLeft() {
		x -= xSpeed;
	}
	@Override
	public void moveRight() {
		x += xSpeed;
		
	}

}
