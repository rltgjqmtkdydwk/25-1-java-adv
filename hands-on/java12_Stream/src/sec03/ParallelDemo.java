// 스트림 연산과 옵션 타입 : 병렬 처리
package sec03;

import java.util.stream.IntStream;

public class ParallelDemo {
    public static void main(String[] args) {
        long start, end, total;

        IntStream sequantial = IntStream.range(1, 100000000);
        start = System.currentTimeMillis();
        total = sequantial.sum();
        end = System.currentTimeMillis();
        System.out.println("순차처리 : " + (end - start));
        System.out.println("순차처리 합계 : " + total);

        IntStream parallel = IntStream.range(1, 100000000).parallel();
        start = System.currentTimeMillis();
        total = parallel.sum();
        end = System.currentTimeMillis();
        System.out.println("병렬처리 : " + (end - start));
        System.out.println("순차처리 합계 : " + total);
    }
}
