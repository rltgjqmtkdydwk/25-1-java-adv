package hw7_1;

public interface Shape {
	// 속성
	double PI = 3.14;
	
	// 메소드
	abstract void draw();
	abstract double getArea();
	default void redraw() {
		System.out.print("--- 다시 그립니다.");
	};
}
