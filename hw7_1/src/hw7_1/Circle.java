package hw7_1;

public class Circle implements Shape {
	// 속성
	int radius;
	
	// 메소드
	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("반지름이 "+ radius +"인 원입니다.");
		
	}

	@Override
	public double getArea() {
		return PI*radius*radius;
	}

}
