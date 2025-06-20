//***************************

// 파일명: Hw13_2.java

// 작성자: 김은총   

// 작성일: 2025/5/16

// 내용: 현재 디렉토리에서 .java 확장자를 가지는 파일만 출력하는 프로그램

//***************************

import java.io.File;

public class hw13_2 {
    public static void main(String[] args) throws Exception {
        System.out.println("hw13_1 : 김은총");

        File f = new File("files");
        String[] flist = f.list(); // 자식 파일 문자열 배열로 반환
        int count = 0;
        if (flist != null) {
            for (int i = 0; i < flist.length; i++) {
                if (flist[i].endsWith(".java")) {
                    System.out.println(flist[i]);
                    count += 1;
                }
            }
        }
        System.out.printf("총 %d개의 파일이 발견되었습니다.\n", count);
    }
}