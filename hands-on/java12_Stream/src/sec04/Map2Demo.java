package sec04;

import java.util.stream.Stream;
import java.util.stream.IntStream;
import sec01.Util;
import sec01.Nation;

public class Map2Demo {
    public static void main(String[] args) {
        Stream<Nation> n1 = Nation.nations.stream();    // Nation 객체 리스트를 스트림으로 생성
        Stream<String> s1 = n1.map(Nation::getName);    // 각 Nation 객체에서 이름만 추출하여 문자열 스트림으로 변환
        s1.limit(4).forEach(Util::printWithParenthesis);    // 처음~인덱스 4 미만까지만 이름을 괄호로 출력(printwithparenthesis)
        System.out.println();

        Stream<Nation> n2 = Nation.nations.stream();    // Nation 객체 리스트를 다시 스트림으로 생성(1회용)
        IntStream is = n2.mapToInt(Nation::getGdpRank); //map의 요소(gdp-rank) 값을 int타입으로 변환
        is.forEach(Util::print);    // GDP 순위 출력
        System.out.println();
    }
}
