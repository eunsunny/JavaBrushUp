package inheritance;

class Circle {
	private double radius = 1.0;
	private String color = "red";
	
	public Circle() { }
	public Circle(double radius) {
		this.radius = radius;
	}
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getArea() {
		return radius * radius * Math.PI;  // Math�� 3.14�� �̹� ���ǵǾ� ����
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}
}
// �ڹ� �����Ϸ��� �ڵ������� �θ��� �����ڸ� ȣ���ϴ� ������ �߰���.
// super();

class Cylinder extends Circle {
	private double height = 1.0;
	
	public Cylinder() {	}
	public Cylinder(double height) {
		this.height = height;
	}
	public Cylinder(double radius, double height) {
		//setRadius(radius);
		//���� �����ſ� super()�� �����
		super(radius);
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getVolume() {
		return getArea() * height;
	}	
}

public class TestCylinder {

	public static void main(String[] args) {
		Cylinder c1 = new Cylinder();
		
		System.out.println("Radius:"+c1.getRadius());
		System.out.println("Height:"+c1.getHeight());
		System.out.println("Base Area:"+c1.getArea());
		System.out.println("Volume:"+c1.getVolume());
		System.out.println();
				
		//System.out.printf("[Radius:%3.1f, Height:%3.1f, Base Area:%3.1f, Volume:%3.1f]\n",c1.getRadius(),c1.getHeight(),c1.getArea(),c1.getVolume());
		
		c1.setHeight(10.0);
		System.out.println("���̰� 10.0�� ��");
		System.out.println("Radius:"+c1.getRadius());
		System.out.println("Height:"+c1.getHeight());
		System.out.println("Base Area:"+c1.getArea());
		System.out.println("Volume:"+c1.getVolume());
		System.out.println();
		//System.out.printf("[Radius:%3.1f, Height:%3.1f, Base Area:%3.1f, Volume:%3.1f]\n",c1.getRadius(),c1.getHeight(),c1.getArea(),c1.getVolume());
					
		c1.setRadius(2.0);
		c1.setHeight(10.0);
		System.out.println("�������� 2.0, ���̰� 10.0�� ��");
		System.out.println("Radius:"+c1.getRadius());
		System.out.println("Height:"+c1.getHeight());
		System.out.println("Base Area:"+c1.getArea());
		System.out.println("Volume:"+c1.getVolume());
		//System.out.printf("[Radius:%3.1f, Height:%3.1f, Base Area:%3.1f, Volume:%3.1f]\n",c1.getRadius(),c1.getHeight(),c1.getArea(),c1.getVolume());

	}
}
