package sec04;

import java.util.Comparator;
import java.util.stream.Stream;
import sec01.Nation;
import sec01.Util;

public class SortedDemo {
    public static void main(String[] args) {
        Stream<String> s1 = Stream.of("d2", "a2", "b1", "b3", "c");
        Stream<String> s2 = s1.sorted();    // 앞글자 크기 비교 후 같으면 다음 글자 크기 비교(a<b, b1<b3);
        s2.forEach(Util::print);

        System.out.print("\n국가 이름 순서 : ");
        Stream<Nation> n1 = Nation.nations.stream();
        Stream<Nation> n2 = n1.sorted(Comparator.comparing(Nation::getName));   //n1 객체 비교하는데 이름끼리 비교
        Stream<String> s3 = n2.map(x -> x.getName());    //각 원소 나라이름으로 변환(람다식)
        s3.forEach(Util::printWithParenthesis);

        System.out.print("\n국가 GDP 순서 : ");
        Stream<Nation> n3 = Nation.nations.stream();
        Stream<Nation> n4 = n3.sorted(Comparator.comparing(Nation::getGdpRank));    //n3 객체 비교하는데 gdp순위끼리 비교
        Stream<String> s4 = n4.map(Nation::getName);    //각 원소 나라이름으로 변환(forEach)
        s4.forEach(Util::printWithParenthesis);
    }
    
}