package 객체지향.InterfaceAbstractExample;

public class Kevin extends Human implements Programmer, SwimAble {


    public Kevin(int x, int y, int age) {
        super(x, y, age);
    }

    @Override
    public void printInfo() {
        System.out.println("Kevin -> " + toString());
    }

    @Override
    public void coding() {
        System.out.println("Hello world");
    }

    @Override
    public void swimDown(int yDistance) {
        setY(getY() - yDistance);
        if(getY() < -10){
            System.out.println("너무 깊이 들어가면 죽을수도 있어!");
        }
    }
}
