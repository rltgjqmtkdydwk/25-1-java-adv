//***************************

// 파일명: StreamDemo.java

// 작성자: 김은총   

// 작성일: 2025/4/18

// 내용: Stream 연습하기 - 4개의 문자열("갈매기", "나비", "다람쥐", "라마")을 포함하는 리스트 객체를 스트림으로 생성. 
// 문자열 크기가 2인 단어만 뽑고, 첫번째 단어만 출력. 체인닝 기법 사용 (하나의 스트리밍 문장으로 실행)
 

//***************************

import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        Stream.of( "갈매기", "나비", "다람쥐", "라마" ).filter(s -> s.length() == 2)
                                                            .limit(1)
                                                            .forEach(x -> System.out.println(x));
    }
}
