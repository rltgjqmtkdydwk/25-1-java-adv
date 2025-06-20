// 스트림 연산과 옵션 타입 : 느긋한 연산과 조급한 연산
package sec03;
import java.util.stream.IntStream;

public class Laxiness1Demo {
    public static void main(String[] args) {
        IntStream is = IntStream.range(1, 5);
        is.filter(x -> {
            System.out.println("filter : " + x);
            return x%2 == 0;
        }).map(x -> {
            System.out.println("map : " + x);
            return x*x;
        }).forEach(x -> 
            System.out.println("forEach : " + x)
        );

    }
}
