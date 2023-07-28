package designPattern.template;

public abstract class AbstractTemplate{
    public void execute(){
        call();
        System.out.println("교육센터에 도착을합니다");
    }
    protected abstract void call();
}