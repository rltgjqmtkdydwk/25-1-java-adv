package java10;
// 람다식 기초 : 람다식의 필요성(5-8p)
import java.util.Arrays;

public class ComparableDemo {
    public static void main(String[] args) {
        Rectangle[] rectangles = { new Rectangle(3, 5),
            new Rectangle(2, 10), 
            new Rectangle(5, 5) 
        };

        Arrays.sort(rectangles); // 사각형 객체끼리 비교할 수 없기 때문에 정렬할 수 없음 => exception 발생 => 
        // 해결방법 : Comparable 클래스 정의

        for (Rectangle r: rectangles)
            System.out.println(r);
    }
}

class Rectangle implements Comparable<Rectangle>{
    private int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public int findArea() {
        return width * height;
    }
    public String toString() {
        return String.format("사각형[폭= %d, 높이= %d]", width, height);
    }

    public int compareTo(Rectangle o) {
        return findArea() - o.findArea();
    }
    
}