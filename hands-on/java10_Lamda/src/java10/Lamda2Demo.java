package java10;

@FunctionalInterface
interface Negative {
    int neg(int x);    
}

@FunctionalInterface
interface Printable {
    void print();    
}

public class Lamda2Demo {
    public static void main(String[] args) {
        Negative n;
        // n = (int x) -> {return -x;}; // return 생략가능
        n = x -> -x;
        System.out.println(n.neg(1));
        Printable p;
        // p = () -> {System.out.println("hello");};  // {}, ; 생략가능 
        p = () -> System.out.println("hello");
        p.print();
    }
}
