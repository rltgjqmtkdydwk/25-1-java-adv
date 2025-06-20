//***************************

// 파일명: StreamCollectorDemo.java

// 작성자: 김은총   

// 작성일: 2025/5/2

// 내용: 문자열 리스트("민국", "지우", "하준", "지우", "하준", "지우")을 포함하는 리스트 객체를 스트림으로 생성
// 문자열과 빈도수로 구성된 Map 타입으로 수집한 후 출력하는 프로그램을 작성하라. 체인닝 기법 사용(하나의 스트리밍 문장으로 실행)
 

//***************************

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamCollectorDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("hw12_2 : 김은총");

        // 문자열 리스트 선언 및 스트림 처리 = Map
        Map<String, Long> nameCount = Arrays.asList("민국", "지우", "하준", "지우", "하준", "지우")
            .stream()
            .collect(Collectors.groupingBy(name -> name, Collectors.counting()));

        System.out.println(nameCount);
    }
}
