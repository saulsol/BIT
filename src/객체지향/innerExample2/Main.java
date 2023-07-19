package 객체지향.innerExample2;

public class Main {

    class InnerClass{}

    static class InnerStaticClass{}

    public static void main(String[] args) {

        Main.InnerStaticClass mi1 = new Main.InnerStaticClass();
        Main.InnerStaticClass mi2 = new Main.InnerStaticClass();

        if(mi1 == mi2) {
            System.out.println("내부 스태틱 클래스는 새로만들어도 같은 참조지");
        }else{
            System.out.println("내부 스태틱 클래스도 클래스니까 다른 참조지");
        }
    }
}
