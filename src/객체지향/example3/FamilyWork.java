package 객체지향.example3;

public class FamilyWork {
    public static void main(String[] args) {
        Me me = new Me();
        me.fatherWork();
        me.sleep(); // 제일 가깝게 오버라이딩된 메소드가 호출된다.
        me.eat(); // 상위 클래스에 있는 메소드를 호출할 수 있다.

        GrandFather grandFather = new Me();
        grandFather.grandFatherWork();

        GrandFather grandFather1 = new Father();
        //((Father)grandFather).fatherWork();




    }
}
