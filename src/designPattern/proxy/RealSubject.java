package designPattern.proxy;

public class RealSubject implements Subject {
    public RealSubject(){};

    @Override
    public void action(People people) {
        System.out.println(people.getName() + "님 관리자 권한이 실행되었습니다.");

    }
}
