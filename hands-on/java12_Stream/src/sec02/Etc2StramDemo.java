// 스트림 종류와 생성 : 기타 데이터로부터 스트림 생성
package sec02;
import java.util.Random; 
import java.util.stream.IntStream; 
import java.util.stream.Stream;

public class Etc2StramDemo {
    public static void main(String[] args) {
        IntStream is1 = IntStream.iterate(1, x->x+2);
        IntStream is2 = new Random().ints(0,10);
        Stream<Double> ds = Stream.generate(Math::random);
        IntStream is3 = IntStream.range(1, 5);
        System.out.println(is1);
        System.out.println(is2);
        System.out.println(ds);
        System.out.println(is3);
    }
}
