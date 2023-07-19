package 객체지향.innerExample;

public class Outer {

    class InstanceInner{} // 인스턴스 이너 클래스
    static class StaticInner{} // 스태틱 이너 클래스

    void method(){
        class localInner{} // 지역 클래스
    }

}
