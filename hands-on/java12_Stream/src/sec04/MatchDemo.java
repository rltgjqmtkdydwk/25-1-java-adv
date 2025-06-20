package sec04;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import sec01.Nation;
import sec01.Util;

public class MatchDemo {
    public static void main(String[] args) {
        boolean b1 = Stream.of("a1", "b2", "c3").anyMatch(s -> s.startsWith("c"));  //원소 1개 이상이 람다식과 일치할 때 true
        System.out.println(b1);

        boolean b2 = IntStream.of(10, 20, 30).allMatch(p -> p%3 == 0);  //모든 원소가 람다식과 일치될 떄 true
        System.out.println(b2);

        boolean b3 = IntStream.of(1, 2, 3).noneMatch(p -> p == 3);  //아무것도 일치되는 게 없을 때 true
        System.out.println(b3);

        Optional<Nation> nation = Nation.nations.stream().findFirst();  //스트림에서 첫 번째 Nation 객체를 Optional로 반환
        nation.ifPresentOrElse(Util::print, () -> System.out.print("없음."));   //Nation이 존재하면(true) 전자 실행, 존재하지 않으면(false) 후자 실행
        System.out.println();

        nation = Nation.nations.stream().filter(Nation::isIsland).findAny();    // isIsland가 true인 Nation 중 임의의 하나를 Optional로 반환
        nation.ifPresent(Util::print);  // 존재할 경우 출력, 존재하지 않으면 아무것도 X
    }
}
