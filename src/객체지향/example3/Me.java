package 객체지향.example3;

public class Me extends Father {

    @Override
    public void eat() {
        System.out.println("난 딴 거 먹을래");
    }

    // 상위 클래스에서 final이 붙으면 오버라이딩 불가


    public void work(){
        System.out.println("I work");
    }


}
