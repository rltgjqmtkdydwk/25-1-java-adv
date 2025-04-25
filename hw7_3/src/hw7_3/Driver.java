//***************************

// 파일명: hw7_3.java

// 작성자: 김은총

// 작성일: 2025/3/21

// 내용: Dog 객체와 AlarmClock 객체 한번씩만 생성하기 떄문에 익명 클래스를 이용하는 프로그램.

//***************************
package hw7_3;

// Dog 객체와 AlarmClock 객체를 하나씩만 생성하고 이용하는 드라이버 클래스
public class Driver {
	public static void main(String[] args) { 
		System.out.println("hw7_3: 김은총");
		
		mydog.speak();
		clock.speak();
		clock.speak();
	}



//speak() 메소드를 갖는 Speakable 인터페이스
interface Speakable {
	//어떤 소리를 내는지 출력하는 메소드
	public void speak();
}


//Speakable 인터페이스를 구현하는 Dog 익명 클래스
static Speakable mydog = new Speakable() {
	public void speak() {
		System.out.println("멍멍");
	}
};


//Speakable 인터페이스를 구현하는 AlarmClock 익명 클래스
static Speakable clock = new Speakable() {
	private int number = 5;
	public void speak() {
		for(int i=0; i<number; i++)
			System.out.print("삐");
			System.out.println();
			number = number + 3;
		}
	};

}
