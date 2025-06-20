public interface Countable {
}

class Bird implements Countable {
    string name;

    public Bird(String name) {
        //name 초기화하는 메소드
        this.name = name;
    }
}