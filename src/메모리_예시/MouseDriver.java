package 메모리_예시;

public class MouseDriver {
    public static void main(String[] args) {

        Mouse mickey = new Mouse();
        mickey.name = "미키";
        mickey.age = 85;
        Mouse.countOfTail = 1;
        mickey.sing();

        mickey = null;

        Mouse jerry = new Mouse();
        jerry.name = "제리";
        jerry.age = 73;
        Mouse.countOfTail = 1;
        jerry.sing();



    }
}
