package designPattern.template;

public class SubClassLogic1 extends  AbstractTemplate {

    @Override
    protected void call() {
        System.out.println("태동님이 버스를 탑니다");
    }

}