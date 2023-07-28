package designPattern.proxy;

public class SubjectProxy extends RealSubject implements Subject {

    private RealSubject subject;
    @Override
    public void action(People people) {
        if(subject == null){
            subject = new RealSubject();
        }
        if(people.getAuth() == Auth.AUTH) subject.action(people);
        else System.out.println("권한이 없습니다.");

    }
}