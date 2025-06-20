package sec05;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

import sec01.Util;

public class Reduce1Demo {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 4, 5, 1, 2);

        // T reduce(Y, BinaryOperator) : 첫번쨰 인숫값을 초깃값으로 제공. 2개 원소를 조합해서 1개 값으로 축약
        int sum1 = numbers.stream().reduce(0, (a, b) -> a + b); //0+3+4+5+1+2
        int sum2 = numbers.stream().reduce(0, Integer::sum);    //0+3+4+5+1+2
        int mul1 = numbers.stream().reduce(1, (a, b) -> a * b); //1*3*4*5*1*2

        System.out.println(sum1);   //15
        System.out.println(sum2);   //15
        System.out.println(mul1);   //120

        // Optional reduce(BinaryOperator) : 2개 원소를 조합해서 1개 값으로 축약
        Optional<Integer> sum3 = numbers.stream().reduce(Integer::sum); //3+4+5+1+2
        OptionalInt sum4 = numbers.stream().mapToInt(x -> x.intValue()).reduce(Integer::sum);   //int(3)+..4+..5+..1+..2
        Optional<Integer> mul2 = numbers.stream().reduce((a, b) -> a * b);  //3*4*5*1*2

        System.out.println(sum3.get()); //15
        System.out.println(sum4.getAsInt());    //15
        mul2.ifPresent(Util::print);    //120
    }
}
