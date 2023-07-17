package 객체지향.inner;

import javax.swing.*;

// InnerClass (MemberInner, LocalInner, StaticInner, Anonymous)
// InnerClass 의 목적 : 접근 제한자와 무관하게 접근 할 객체
public class OuterClass extends SuperOuter {

    private int outerValue;


    private void outerMethod(){
        this.superOuterMethod(); // private 만 접근을 못한다. public은 가능
        System.out.println("outerMethod");

    }




    // 이너 클래스 : 멤버 클래스 -> 마치 멤버 변수처럼 활용되기 때문에
    // 외부 객체 생성 없이 멤버 이너 클래스를 생성할 수 없다.
    // 내부 클래스는 외부 클래스의 private 멤버도 접근할 수 있다.
    public class Inner extends JFrame{
        public Inner(){

            // this.outerValue; -> this 키워드는 항상 클래스 자기 자신을 말한다.
            // InnerClass 내부에 outerValue가 없기 때문에
            outerValue = 100;
            System.out.println("Inner");
            outerMethod();
            innerMethod();
            superOuterMethod(); // 퍼블릭이면 호출 가능
        }

        public void innerMethod(){
            System.out.println("InnerMethod");
//            this.outerValue;
            OuterClass.this.outerValue =100;
            // 외부 클래스.this.외부 변수 -> 접근이 가능
//             SuperOuter.this.superOuterValue;
            // 외부 클래스의 상위 클래스에 대한 접근은 불가능
        }


    }

    public static class StaticInner{
        // outerValue = 100;
    }




    public static void main(String[] args) {

        OuterClass.Inner inner = new OuterClass().new Inner();






    }
}
