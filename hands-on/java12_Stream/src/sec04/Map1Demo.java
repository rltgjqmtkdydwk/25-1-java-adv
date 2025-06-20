package sec04;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import sec01.Util;

public class Map1Demo {
    public static void main(String[] args) {
        Stream<String> s1 = Stream.of("a1", "b1", "b2", "c1", "c2");    // 문자열 스트림 생성: "a1", "b1", "b2", "c1", "c2"

        Stream<String> s2 = s1.map(String::toUpperCase);    // 모든 문자열을 대문자로 변환
        s2.forEach(Util::print);
        System.out.println();

        Stream<Integer> i1 = Stream.of(1, 2, 1, 3, 3, 2, 4);    // 정수 스트림 생성: 중복된 숫자 포함

        Stream<Integer> i2 = i1.map(i -> i * 2);    // 각 정수에 2를 곱함
        i2.forEach(Util::print);
        System.out.println();

        Stream<String> s3 = Stream.of("a1", "a2", "a3");    // 문자열 스트림 생성: "a1", "a2", "a3"

        Stream<String> s4 = s3.map(s -> s.substring(1));    // 각 문자열에서 숫자 부분[1]만 추출 ("1", "2", "3")

        IntStream i3 = s4.mapToInt(Integer::parseInt);  // 문자열을 정수로 변환 (IntStream으로 변환)

        Stream<String> s5 = i3.mapToObj(i -> "b" + i);  // 각 숫자에 "b"를 붙여 다시 문자열 스트림으로 변환 ("b1", "b2", "b3")

        // 결과 출력
        s5.forEach(Util::print);
    }
}
