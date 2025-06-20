// 스트림 소개 : 함수형 연산에 맞게 수행되는 스트림
package sec01;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 10; i++)
            list.add(r.nextInt(30));
        
        List<Integer> gt10 = new ArrayList<>();
        for (int i : list)  // list 원소 복사
            if (i > 10)
                gt10.add(i);
        
        Collections.sort(gt10);     // 정렬
        System.out.println(gt10);   // [13, 15, 17, 19, 23, 23, 24]

        list.stream().filter(i -> i>10).sorted()    // 정렬
                        .forEach(x -> System.out.print(x+" ")); // 13 15 17 19 23 23 24
    }
}
