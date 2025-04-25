package hw7_1;

public class Rect implements Shape{
	// 속성
	int width, height;
	
	// 메소드
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println(width +"X"+ height + "크기의 사각형입니다.");
		
	}

	@Override
	public double getArea() {
		return width * height;
	}

}
