//***************************

// 파일명: hw7_2.java

// 작성자: 김은총

// 작성일: 2025/3/21

// 내용: 속성값을 리셋하는 reset() 메소드를 가지는 Resettable 인터페이스를 정의하고 이용하는 프로그램

//***************************
package hw7_2;

public class Driver {

	public static void main(String[] args) {
		System.out.println("hw7_2: 김은총");
		
		BankAccount b = new BankAccount(1000);
			
		b.deposit(500);
		b.withdraw(200);
		System.out.println(b.toString());
		b.reset();
		System.out.println(b.toString());
		
		Point p = new Point(1.5, 2.5);
		p.move(2.1, 2.1);
		p.move(10.0, 10.0);
		System.out.println(p.toString());
		p.reset();
		System.out.println(p.toString());

	}

}
