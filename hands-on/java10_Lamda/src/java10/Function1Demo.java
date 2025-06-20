package java10;

import java.util.function.Function; 
import java.util.function.IntToDoubleFunction; 
import java.util.function.ToDoubleBiFunction;

public class Function1Demo {
    public static void main(String[] args) {
        Function<Integer, Integer> add2 = x -> x+2;
        Function<Integer, Integer> mul2 = x -> x*2;
        System.out.println(add2.apply(3)); // 덧셈 함수에 인수 전달
        System.out.println(mul2.apply(3)); // 곱셈 함수에 인수 전달
        System.out.println(add2.andThen(mul2).apply(3)); // add2(3) -> add2(3).mul2(3) 
        System.out.println(add2.compose(mul2).apply(3)); // mul2(3) -> mul2(3).add2(3)

        IntToDoubleFunction half = x -> x / 2.0;
        System.out.println(half.applyAsDouble(5)); //실수 전달
        
        ToDoubleBiFunction<String, Integer> circleArea = 
            (s, i) -> Double.parseDouble(s) * i * i;
        double area = circleArea.applyAsDouble("3.14", 5); //실수 연산으로 전달
        System.out.println(area);
    }
}
