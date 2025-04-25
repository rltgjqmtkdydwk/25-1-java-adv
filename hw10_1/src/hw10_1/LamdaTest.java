//***************************

// 파일명: hw10_1.java

// 작성자: 김은총

// 작성일: 2025/3/28

// 내용: Timer 클래스를 람다식을 이용해 작성하는 프로그램

//***************************
package hw10_1;

// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
import javax.swing.Timer;

public class LamdaTest {
	public static void main(String[] args) {
		System.out.println("hw10_1: 김은총");
		
		Timer t = new Timer(1000, event -> System.out.println("beep"));
		t.start();
		for (int i = 0; i < 1000; i++) {
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {}
		}

//		1. 원래 문제
//		Timer t = new Timer(1000, new ActionListener() {
//			public void actionPerformed(ActionEvent event) {
//				System.out.println("beep");
//			};
//		});
//		t.start();
//		for (int i = 0; i < 1000; i++) {
//			try {
//				Thread.sleep(1000);
//				System.out.println("beep");
//			}
//			catch (InterruptedException e) {}
//		}

//		2. 첫번째 시도 : 추상인터페이스
//		@FunctionalInterface
//		interface Timer{
//			void start();
//		}
//		Timer t = () -> {
//			for (int i = 0; i < 1000; i++) {
//				try {
//					Thread.sleep(1000);
//					System.out.println("beep");
//				}
//				catch (InterruptedException e) {}
//			}
//		};
//		t.start();

		
	}
}