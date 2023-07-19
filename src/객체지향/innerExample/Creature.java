package 객체지향.innerExample;

public class Creature {

    int life = 50;

    // Animal 클래스는 Creature 클래스의 내부 클래스
    private class Animal{
        private String name = "호랑이";

        int getOuter(){
            return life;
        }
    }

    public void method(){
        Animal animal = new Animal();
        // Animal 객체는 오로지 Creature 클래스의 메소도 내에서만 사용된다고 가정


        // Getter 없이 내부 클래스의 private 멤버에 접근이 가능
        System.out.println(animal.name); // 호랑이
        
        // 내부 클래스에서 외부 클래스이 private 멤버를 출력
        System.out.println(animal.getOuter()); // 50

    }



}
