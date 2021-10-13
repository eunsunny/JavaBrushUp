package interface_ex3;

public class MovablePoint implements Movable {
	int x;  //x의 좌표값
	int y;	//y의 좌표값
	int xSpeed;	 //x축으로 움직이는 point 수
	int ySpeed;  //y축으로 움직이는 point 수
	
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	@Override
	public String toString() {
		return "현재위치=("+x+","+y+")\nsXspeed="+xSpeed+" ySpeed="+ySpeed+"\n이동위치"
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
