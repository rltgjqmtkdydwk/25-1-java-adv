//***************************

// 파일명: hw10_2.java

// 작성자: 김은총

// 작성일: 2025/4/4

// 내용: 함수형 인터페이스를 이용해 작성하는 프로그램

//***************************
package hw10_2;

import java.util.Scanner;
import java.util.function.BiFunction;

public class LamdaTest {
	public static void main(String[] args) {
		System.out.print("hw10_2:김은총\n");
        Scanner sc = new Scanner(System.in);
        int x;
        int y;
        BiFunction<Integer, Integer, Integer> m = (a, b) -> a * b;
        System.out.print("첫 번째 정수 입력 : ");
        x = sc.nextInt();
        System.out.print("두 번째 정수 입력 : ");
        y = sc.nextInt();
        System.out.print("두 정수의 곱은 "+ m.apply(x, y) +" 입니다.");
        sc.close();
        }
} 