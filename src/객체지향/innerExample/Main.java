package 객체지향.innerExample;

public class Main {
    public static void main(String[] args) {

        PocketBall pocketBall = new PocketBall();
        // 먼저 외부 클래스를 인스턴스화 하고
        PocketBall.PocketMonster pocketMonster = pocketBall.new PocketMonster();
        // 외부클래스.내부클래스 형식으로 내부 클래스흘 초기화 하여 사용할 수도 있다.
        pocketMonster.getPocketMember();




    }

}
