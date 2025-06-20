package sec04;

import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Optional;

import sec01.Nation;
import sec01.Util;

public class LoopAggregateDemo {
    public static void main(String[] args) {
        Stream<Nation> sn = Nation.nations.stream().peek(Util::printWithParenthesis);   //스트림 생성, peek: 각 요소를 소비 전에 괄호 출력하도록 설정(지연 연산)
        System.out.println("어디 나타날까?");   //peek은 아직 실행되지 않음(중간 연산)

        Optional<Nation> on = sn.max(Comparator.comparing(Nation::getPopulation));  //스트림에서 인구가 가장 많은 Nation을 찾아 Optional로 반환
        System.out.println();
        System.out.println(on.get());   //Optional.get 사용(=on.ifPresent())

        System.out.println(IntStream.of(5, 1, 2, 3).min().getAsInt());  // IntStream에서 최솟값을 구해 출력

        sn = Nation.nations.stream();   //sn 다시 생성
        System.out.println(sn.count()); //전체 Nation 개수 출력
    }
}
