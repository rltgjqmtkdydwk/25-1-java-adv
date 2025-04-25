package java10;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> c1 = x -> System.out.println(x.toLowerCase()); // x.toLowerCase() 값 리턴
        c1.accept("Java Functional Interface");

        BiConsumer<String, String> c2 = (x, y) -> System.out.println(x + " : " + y); // x + " : " + y 값 리턴
        c2.accept("java", "lamda");

        ObjIntConsumer<String> c3 = (s, x) -> {
            int a = Integer.parseInt(s) + x; // 문자열을 정수로 바꾸고 덧셈 연산 값 리턴
            System.out.println(a);
        };
        c3.accept("100", 50);

        IntConsumer c4 = x -> System.out.printf("%d * %d = %d\n", x, x, x*x);
        IntConsumer c5 = c4.andThen(x -> System.out.printf("%d + 10 = %d\n", x, x+10)); //먼저 c4에 인수 전달 후 c5에 인수 전달한 값 리턴
        c5.accept(10);
    }
}
