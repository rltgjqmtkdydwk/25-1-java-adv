package sec05;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import sec01.Nation;

public class GroupingDemo {
    public static void main(String[] args) {
        Stream<Nation> sn = Nation.nations.stream().limit(4);
        Map<Nation.Type, List<Nation>> m1 = sn.collect(Collectors.groupingBy(Nation::getType));
        System.out.println(m1); //{LAND=[ROK, USA], ISLAND=[New Zealand, China]}
        
        sn = Nation.nations.stream().limit(4);
        Map<Nation.Type, Long> m2 = sn.collect(Collectors.groupingBy(Nation::getType, Collectors.counting()));
        System.out.println(m2); //{LAND=2, ISLAND=2}
        
        sn = Nation.nations.stream().limit(4);
        Map<Nation.Type, String> m3 = sn.collect(
            Collectors.groupingBy(Nation::getType,
            Collectors.mapping(Nation::getName,
            Collectors.joining("#"))));
        System.out.println(m3); //{LAND=ROK#USA, ISLAND=New Zealand#China}
    }
}
