package 객체지향.abstractEx;


abstract class Dog1 {
    abstract void sleep(); // 추상 메서드
    abstract void bark(); // 추상 메서드
}

class Poodle extends Dog1{
    @Override
    void sleep() {}

    @Override
    void bark() {}
}

abstract class Pome extends Dog1{
    @Override
    void bark() {}
    // 추상클래스에선 상위 클래스의 추상 메소드를 선택적으로 구현할 수 있다.
}






public class Abstraction {
}
