package methods;

class Rectangle {
	float length = 1.0f;
	float width = 1.0f;

	public Rectangle() { } // 지금은 public 붙여도되고 안붙여도됨

	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {  //float length 이거 넣어야 함
		this.length = length;
	}

	public float getWidth() {
		return length;
	}

	public void setWidth(float width) {  // ㄱ객체생성이후 변수의 값을 바꿔주고 싶을떄 사용하는 것
		this.width = width;
	}

	public double getArea() {
		return (double)length * width;
	}

	public double getPerimeter() {
		return 2.0*length + 2.0*width;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}
}

public class RectanglePer {

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle();

		System.out.println(r1.toString()); // toString() 안써도 자동으로 호출되게 되어있음
		System.out.println("Area = "+r1.getArea());
		System.out.println("Perimeter = "+r1.getPerimeter());
		
		Rectangle r2 = new Rectangle(2.0f, 3.0f);
		
		System.out.println("변경된 값: "+r2.toString());
		System.out.println("Area = "+r2.getArea());
		System.out.println("Perimeter = "+r2.getPerimeter());
		
		r2.setLength(3.0f); // 나중에 멤버 변수를 변경하고 싶을 떄 쓰는 것
		System.out.println("변경된 값: "+r2.toString());
	}
}
