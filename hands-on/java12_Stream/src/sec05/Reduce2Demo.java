package sec05;

import java.util.DoubleSummaryStatistics;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

import sec01.Nation;

public class Reduce2Demo {
    public static void main(String[] args) {
        // 인구가 가장 많은 나라 하나를 reduce로 계산 (Optional로 반환)
        Stream<Nation> s1 = Nation.nations.stream();
        s1.reduce((n1, n2) -> n1.getPopulation() > n2.getPopulation() ? n1 : n2)
            .ifPresent(System.out::println);

        // GDP 순위가 20위 이내인 나라들의 인구 총합 계산 (초깃값 0.0에서 누적)
        Stream<Nation> s2 = Nation.nations.stream();
        double sumOfPopulation = s2.filter(n -> n.getGdpRank() <= 20)
                                    .mapToDouble(n -> n.getPopulation())
                                    .reduce(0.0, (n1, n2) -> n1 + n2);
        System.out.println("리스트에서 GDP가 20위 이내의 나라의 인구 총합은 " + sumOfPopulation + "백만명이다.");
        
        // 인구 통계 요약 객체 생성
        Stream<Nation> s3 = Nation.nations.stream();
        DoubleStream ds = s3.mapToDouble(Nation::getPopulation);
        DoubleSummaryStatistics dss = ds.summaryStatistics();
        System.out.println(dss);    //DoubleSummaryStatistics{count=7, sum=13637.900000, min=4.500000, average=1948.271429, max=13355.700000}
    }
}
