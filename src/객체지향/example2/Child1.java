package 객체지향.example2;

import 객체지향.example2.Super;

// 상속은 객체를 유기적으로 연결
// extends는 확장을 의미한다.
// ~은 `~이다  => extends
public class Child1 extends Super {

    int childValue;

    public Child1(){
        super(); // 생략되어 있음
        this.superMethod(); // 상속받으면 this로 접근할 수 있다.
        this.superValue = 10; // 상위 클래스에서 변수의 접근 제어자를 private으로 바꾸면 접근이 불가능
        System.out.println("Child1()");
    }

    public void child1Method(){
        System.out.println("child1Method");
    }

}
