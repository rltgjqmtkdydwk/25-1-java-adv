//***************************

// 파일명: hw7_1.java

// 작성자: 김은총

// 작성일: 2025/3/14

// 내용: Shape이라는 인터페이스와 이를 상속하는 Circle, Rect 클래스를 정의하고 이용하는 프로그램

//***************************
package hw7_1;

public class Driver {

	public static void main(String[] args) {
		System.out.println("hw7_1: 김은총");
		
		// (1) 크기가 4인 Shape 배열을 생성하고, 다음과 같은 Circle 객체 2, Rect 객체 2개를 생성하여 배열에 저장
		Shape[] shapes = new Shape[4];
		
		shapes[0] = new Circle(10);
		shapes[1] = new Circle(20);
		shapes[2] = new Rect(10, 40);
		shapes[3] = new Rect(20, 40);
		
		// (2) 반복문을 이용하여 배열 원소들의 redraw() 메소드 호출
		for (int i = 0; i<shapes.length; i++) {
			shapes[i].redraw();
			shapes[i].draw();
		}
		
		// (3) 반복문을 이용하여 배열 원소들의 getArea() 메소드를 호출하여 아래와 같이 출력
		for (Shape shape : shapes) {
            System.out.println("면적은 " + (double) shape.getArea());
        }

	}

}
