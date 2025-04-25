package hw7_2;

public class Point implements Resettable {
	double x, y; //x좌표, y좌표
	final double rex, rey;
	
	public Point(double rex, double rey) {
		this.x = rex;
		this.y = rey;
		this.rex = rex;
		this.rey = rey;
	} //x, y 좌표를 매개변수로 하여 초기화 하는 생성자
	
	public void move(double dx, double dy) {
		x += dx;
		y += dy;
	} //이동 - x축이동량, y축이동량을 매개변수로 받아 좌표 이동

	@Override
	public String toString() {
		return "좌표 (" + x + ", " + y + ")";
	} //toString 오버라이드
	
	@Override
	public void reset() {
		this.x = rex;
		this.y = rey;
	} //reset구현
	
}
