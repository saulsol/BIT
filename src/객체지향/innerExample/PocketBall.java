package 객체지향.innerExample;

public class PocketBall {

    // 인스턴스 변수
    int size = 100;
    int price = 5000;

    class PocketMonster{

        String name = "이상해씨";
        int level = 10;

        // static int cost = 100;
        // 인스턴스 내부 클래스에는 static 변수를 선언할 수 없다.
        // 외부 클래스가 객체가 된 후에 내부 클래스가 객체가 될 수 있기 때문에 static 멤버 사용 불가능

        public void getPocketMember(){

            // 별다른 조건없이 외부 클래스 멤버 접근 가능
            System.out.println(size);
            System.out.println(price);

            // 내부 클래스 멤버
            System.out.println(name);
            System.out.println(level);

        }


    }


}
