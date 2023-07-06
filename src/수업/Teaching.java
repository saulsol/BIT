package 수업;

// java의 특징 (객체지향 언어, 운영체제에 독립적, 인터프리터, 자동 메모리, 스레드 지원)
//

public class Teaching {

    int a = 10; // 초기값에 한에서 값을 넣을 순 있다

    private int cnt;
    // 해당 변수는 어느 시점에 생성될까?
    // 객체가 생성될 때

    static String message; // 정적으로 메모리가 할당된다.

    public void show(){
        // private char c; -> 접근제어자가 private
        // 로컬에 private 를 붙이는 건 의미없는 짓
        // 메소드는 사용하는데

        // 스태틱 변수도 메서드 내부에 선언할 수 없다
        // 스태틱 블록 안에 생성된 x도 다르다.
    }

}
