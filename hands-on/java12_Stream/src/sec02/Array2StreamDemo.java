// 스트림 종류와 생성 : 스트림 생성
package sec02;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Array2StreamDemo {
    public static void main(String[] args) {
        int [] ia = {2, 3, 5, 7, 11, 13};
        IntStream is = Arrays.stream(ia);
        is.forEach(s -> System.out.print(s+" "));
        System.out.println();

        String[] strings = {"펜은", "칼보다", "강하다"};
        Stream<String> ss = Stream.of(strings);
        ss.forEach(s -> System.out.print(s+" "));
        System.out.println();

        double[] da = {1.2, 3.14, 5.8, 0.2};
        DoubleStream ds = DoubleStream.of(da);
        ds.forEach(s -> System.out.print(s+" "));
        System.out.println();
    }
}
