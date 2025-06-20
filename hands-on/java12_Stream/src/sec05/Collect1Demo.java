// java17 에러 발생
package sec05;

import java.util.IntSummaryStatistics;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Optional;

import sec01.Nation;

public class Collect1Demo {
    public static void main(String[] args) {
        Stream<Nation> sn = Nation.nations.stream();
        Double avg = sn.collect(Collectors.averagingDouble(Nation::getPopulation)); //인구 평균 계산
        System.out.println("인구 평균: " + avg);

        sn = Nation.nations.stream();
        Long num = sn.collect(Collectors.counting());   //요소 개수 세기
        System.out.println("나라 개수 : "+ num);

        sn = Nation.nations.stream();
        String name1 = sn.limit(4)
                            .collect(Collectors.joining("-"));    //toString 결과를 '-'로 연결
        System.out.println("4개 나라(방법1) : "+ name1);

        sn = Nation.nations.stream();
        String name2 = sn.limit(4)
                            .collect(Collectors.mapping(n -> (String) n.getName(), Collectors.joining("+")));  //이름 추출 후 '+'로 연결
        System.out.println("4개 나라(방법2) : "+ name2);

        sn = Nation.nations.stream();
        Optional<Double> max = sn.map(Nation::getPopulation)
                                    .collect(Collectors.maxBy(Double::compare));    //최대 인구값 계산 (Optional)
        System.out.println("최대 인구 나라의 인구수 : "+ max);

        // GDP 순위에 대한 요약 통계
        sn = Nation.nations.stream();
        IntSummaryStatistics sta = sn.collect(Collectors.summarizingInt(x -> x.getGdpRank()));
        System.out.println(sta);
    }
}
