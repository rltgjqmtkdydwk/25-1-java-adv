//***************************

// 파일명: Hw13_1.java

// 작성자: 김은총   

// 작성일: 2025/5/9

// 내용: input.txt 파일의 내용을 읽어 모두 대문자로 변환한 후,
//       화면에 출력하고 output.txt 파일에 저장하는 프로그램

//***************************

import java.io.*;

public class Hw13_1 {
    public static void main(String[] args) {
        System.out.println("hw13_1 : 김은총");

        String input = "java/input.txt";
        String output = "java/output.txt";

        // try-with-resources : 자원 자동관리
        try (
            BufferedReader reader = new BufferedReader(new FileReader(input));
            PrintWriter writer = new PrintWriter(new FileWriter(output));
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                String upperLine = line.toUpperCase(); // 소문자를 대문자로
                System.out.println(upperLine); // 화면 출력
                writer.println(upperLine);     // 파일 저장
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
