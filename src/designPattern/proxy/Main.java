package designPattern.proxy;

public class Main {

    public static void main(String[] args) {
        Subject subject = new SubjectProxy();
        People won = new People("박혜원", Auth.AUTH);
        People gyu = new People("김규년", Auth.UNAUTH);
        System.out.println("권한 O");
        subject.action(won);
        System.out.println("권한 x");
        subject.action(gyu);
    }
}
