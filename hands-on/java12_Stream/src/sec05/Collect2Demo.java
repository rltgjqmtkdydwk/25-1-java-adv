package sec05;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.function.Predicate;

import sec01.Nation;
import sec01.Util;

public class Collect2Demo {
    public static void main(String[] args) {
        // 국가 이름 중 처음 3개를 리스트로 수집
        Stream<Nation> sn = Nation.nations.stream();
        Stream<String> ss = sn.map(Nation::getName).limit(3);
        List<String> list = ss .collect(Collectors.toList());
        System.out.println(list);   //[ROK, New Zealand, USA]
        
        // 처음 3개 국가의 이름을 Set으로 수집 (중복 제거)
        sn = Nation.nations.stream();
        Set<String> set = sn .map(Nation::getName)
                                .limit(3)
                                .collect(Collectors.toSet());
        System.out.println(set);    //[New Zealand, USA, ROK]
        
        sn = Nation.nations.stream();
        Map<String, Double> map = sn .filter(Nation::isIsland)
                                        .collect(Collectors
                                        .toMap(Nation::getName, Nation::getPopulation));
        System.out.println(map);    //{New Zealand=4.5, Sri Lanka=21.9, China=107.7, United Kingdom=63.7}
        
        sn = Nation.nations.stream();
        Set<Nation> hashSet = sn .filter(Predicate.not(Nation::isIsland))
                                    .collect(Collectors.toCollection(HashSet<Nation>::new));
        hashSet.forEach(x -> Util.print("(" + x.getName() + ", " + x.getGdpRank() + ")"));
        System.out.println();   //(ROK, 11) (Morocco, 60) (USA, 2)
    }
}
