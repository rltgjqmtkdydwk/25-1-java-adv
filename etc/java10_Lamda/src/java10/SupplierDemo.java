package java10;

import java.text.SimpleDateFormat; 
import java.util.Date; 
import java.util.function.DoubleSupplier; 
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<String> s1 = () -> "apple";
        System.out.println(s1.get()); // 문자열 반환

        int[] x = { 0 };
        IntSupplier s2 = () -> x[0]++; // 호출할 때마다 x[0] 값을 1씩 증가시켜 반환
        for (int i = 0; i < 3; i++)
            System.out.println(s2.getAsInt()); // 0 1 2

        DoubleSupplier s3 = () -> Math.random()*10;
        System.out.println(s3.getAsDouble()); // 실수값 리턴

        SimpleDateFormat format = new SimpleDateFormat("MM월 dd일(E요일) a hh:mm:ss");
        Supplier<String> s4 = () -> format.format(new Date());
        System.out.println(s4.get()); // 문자열 반환
    }
}
