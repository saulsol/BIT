package 객체지향.innerExample2;

import 객체지향.ObjectEx;

public class AnonymousExample {




    public static void main(String[] args) {

        // Object 클래스를 일회성으로 익명 클래스로 선언하여 변수 o에 저장

        Object o = new Object(){
            @Override
            public String toString() {
                return "익명클래스로 바꿔버린 일회성 객체의 메서드";
            }
        };

        System.out.println(o);






    }

}
