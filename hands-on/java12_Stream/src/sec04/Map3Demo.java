package sec04;

import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;
import sec01.Util;

public class Map3Demo {
    public static void main(String[] args) {
        List<String> list1 = List.of("안녕, 자바!", "잘 가, C!");
        Stream<String> s1 = list1.stream(); //리스트를 스트림 객체로 생성
        // 공백 기준으로 나눈 배열을 스트림으로 변환하여 평탄화 (2차원(e1, e2) → 1차원(e1-e2))
        Stream<String> s2 = s1.flatMap(s -> Arrays.stream(s.split(" ")));   // "안녕,"-"자바!"-"잘"-"가,"-"C!"
        s2.forEach(Util::printWithParenthesis);
        System.out.println();

        List<String> list2 = List.of("좋은 아침");
        List<String> list3 = List.of("안녕! 람다", "안녕! 스트림");

        Stream<List<String>> s3 = Stream.of(list1, list2, list3);
        Stream<String> s4 = s3.flatMap(list -> {
            if (list.size() > 1)
                return list.stream();   // 리스트 크기가 1 초과일 경우, 리스트를 스트림으로 반환(유지 => list3 반환 후 flatmap)
            else
                return Stream.empty();  // 1개 이하면 빈 스트림 반환(필터링 효과 => list2는 반환X)
        });
        s4.forEach(Util::printWithParenthesis);
        System.out.println();
    }
}
