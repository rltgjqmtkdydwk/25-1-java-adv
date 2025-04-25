//***************************

// 파일명: PersonTest.java

// 작성자: 김은총

// 작성일: 2025/4/7

// 내용: 람다식을 사용하여 사람의 신장과 체중의 평균을 구하는 프로그램

//***************************
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class PersonTest {
    public static void main(String[] args) {
        System.out.println("hw10_3 : 김은총");
        System.out.println("평균 신장 : " + average(p -> Double.valueOf(p.getHeight()))); // p객체의 height 받아서 f에 전달
        System.out.println("평균 체중 : " + average(p -> Double.valueOf(p.getWeight()))); // p객체의 weight 받아서 f에 전달
    }

    public static double average(Function<Person, Double> f) {
        List<Person> p = Person.persons;
        double sum = 0;
        for (int i=0; i<p.size(); i++) {
            sum += f.apply(p.get(i)); // apply()로 객체 하나씩 전달
        }
        return p.isEmpty() ? 0 : sum/p.size() ; // p가 비어있지 않으면 평균 계산해서 출력

        // 아래의 역할은 함수형 인터페이스와 람다식으로 구현할 수 있음.
        // double avg_h, avg_w;
        // for (int i=0; i<p.size(); i++) {
        //     avg_h = (p.get(i).getHeight()) / p.size();
        //     avg_w = (p.get(i).getWeight()) / p.size();
        // }
    }
}

class Person {
    private String name;
    private int height, weight;

    public Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name + "(" + height + ", " + weight + ")";
    }

    static List<Person> persons = Arrays.asList(
            new Person("황진이", 160, 45), 
            new Person("이순신", 180, 80),
            new Person("김삿갓", 175, 65), 
            new Person("홍길동", 170, 68),
            new Person("배장화", 155, 48)
    );
}