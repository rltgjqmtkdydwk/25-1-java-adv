//***************************

// 파일명: CollectionDemo.java

// 작성자: 김은총   

// 작성일: 2025/4/11

// 내용: 학생의 점수를 ArrayList에 저장하여 점수에 따른 등급을 출력하는 프로그램

//***************************
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CollectionDemo {
    public static void main(String[] args) {
        System.out.println("hw11_1 : 김은총");
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> scores = new ArrayList<>(); // scores 선언

        while (true) {
            System.out.print("점수를 입력하세요 : ");
            int n = scanner.nextInt();
            if (n < 0) break; // 음수 입력 시 종료
            scores.add(n);
        }
        System.out.printf("전체 학생은 %d명이다.\n", scores.size()); // scores 개수로 학생 수 세기

        System.out.print("학생들의 성적 : ");
        for (Integer s : scores) {
            System.out.print(s + " "); // for-each로 점수 출력
        }
        System.out.println();

        // int max_score = scores.sort(null).get(scores.size() - 1); // 오름차순 정렬하면 마지막 인덱스가 최고점수 
        // -> 근데 반환값이 void라 이렇게 쓸 수 없음. 원본리스트를 저장해야 하는데 귀찮.
        int max_score = Collections.max(scores); // -> Collections로 원본 순서를 바꾸지 않고 최댓값 찾기
        int i = 0;
        for (Integer s : scores) {
            System.out.printf("%d번 학생의 성적은 %d점이며 등급은 %s이다.\n", i, s, Grade(s, max_score)); // 순서대로 점수와 등급 출력
            i++;
        }

        scanner.close();
    }

    // 점수에 따른 등급 반환
    public static String Grade(int score, int max) {
        int grade = max - score;
        if (grade <= 10) return "A";
        else if (grade <= 20) return "B";
        else if (grade <= 30) return "C";
        else return "F";
    }
}
