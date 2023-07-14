package 객체지향.example4;
// Interface 완전 추상 클래스 (상수 + 추상 메소드)

public interface WindowInterface {

//    public void windowInterface(){
//
//    }

    // 일반적인 메소드는 인터페이스에 올 수 없다.
    // 하지만 default 키워드를 붙이면 일반 메소드도 구현할 수 있다.

    static int data = 0;
    // 인터페이스는 객체를 생성할 수 없기 때문에 변수를 선언하면 자동 static이 붙는다.

    public void windowOpen(); // -> 추상 메소드
    // abstract 키워드를 써도 되고 안 써도 된다.

    public static void showStatic(){ // 인터페이스는 스태틱 메소드를 만들 수 있다.
        System.out.println("showStatic");
    }




}
