package 객체지향.innerExample2;

public class Main {
    public static void main(String[] args) {

        PocketBall.PocketMonster pocketMonster = new PocketBall.PocketMonster();
        System.out.println(pocketMonster.level);
        System.out.println(PocketBall.PocketMonster.name);

        // 스태틱 내부 클래스의 인스턴스는 외부 클래르를 먼저 생성하지 않아도 된다.

        // 클래스.정적내부클래스.정적메소드()
        PocketBall.PocketMonster.getPocketMember();


    }
}
