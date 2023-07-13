package 객체지향.aboutClassDIffer;

public class A { //외부

    static int v;

    public class B{ // 내부
        // static int vv; --> 외부 객체가 생성되기 전에 static 에 올라가야 하는데 그럴 수 없다.

    }

    class InnerClass{


    }
    public static class V{ // 내부
         static int vv;  // V class에 static이 붙어서 사용 가능

    }

    public void method(){
        // static int vv; -> 객체가 생성된 시점에 할당되는데 이미 static이 붙어서 논리상 맞지 않다.
    }

    public static void main(String[] args) {

    }
}
