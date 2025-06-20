package java10;
// 람다식 기초 : 정렬 메서드 구현(10-11p)
// import java.lang.reflect.Array;
import java.util.Arrays;
// import java.util.Comparator;

public class ComparatorDemo {
    public static void main(String[] args) {
        String[] strings = { "로마에 가면 로마법을 따르라.",
            "시간은 금이다.", "펜은 칼보다 강하다." };
        
        // Arrays.sort(strings, new Comparator<String>() { // .sort(배열, 객체 비교 방식)
        //     public int compare(String first, String second) {
        //         return first.length() - second.length();
        //     }
        // });
        Arrays.sort(strings, (first, second) -> first.length() - second.length()); // 위 코드를 람다식으로 변환
        
        for (String s : strings)
            System.out.println(s);
    }
}
