package 객체지향.InterfaceAbstractExample;

public class Turtle extends Animal implements SwimAble {


    public Turtle(int x, int y, int age) {
        super(x, y, age);
    }

    @Override
    public void printInfo() {
        System.out.println("Turtle -> " + toString());
    }

    @Override
    public void swimDown(int yDistance) {
        setY(getY() - yDistance);
    }
}
