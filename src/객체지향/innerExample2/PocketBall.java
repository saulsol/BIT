package 객체지향.innerExample2;

public class PocketBall {

    int size = 100;
    static int price = 5000;

    static class PocketMonster{
        static String name = "이상해씨";
        int level = 10;

        public static void getPocketMember(){
            // 외부 클래스 인스턴스 멤버 접근 불가능
            // System.out.println(size);

            System.out.println(price);
            // 외부 클래스 스태틱 멤버 접근 가능

            // 내부 클래스 멤버도 스태틱 멤버만 접근 가능
            System.out.println(name);
            // System.out.println(level);
        }


    }


}
