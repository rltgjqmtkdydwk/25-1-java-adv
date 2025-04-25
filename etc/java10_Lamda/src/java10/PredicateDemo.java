package java10;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        IntPredicate even = x -> x%2 == 0;
        System.out.println(even.test(3) ? "짝수":"홀수"); // test()로 bool 조사 : 3은 false

        IntPredicate one = x -> x == 1;
        IntPredicate oneOrEven = one.or(even); // or()로 one이나 even이 true면 true인 조건을 생성 : '1이거나 짝수'인 조건 생성
        System.out.println(oneOrEven.test(1) ? "1 or even":"not 1 and odd");

        Predicate<String> p = Predicate.isEqual("Java Lamda"); // isEqual()로 문자열 비교
        System.out.println(p.test("Java Lamda"));
        System.out.println(p.test("JavaFX"));

        BiPredicate<Integer, Integer> bp = (x, y) -> x > y;
        System.out.println(bp.test(2, 3)); // bp로 두개 파라미터(Bi) 받음 : 2 > 3 => false
    }
}
