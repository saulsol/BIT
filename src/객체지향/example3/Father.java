package 객체지향.example3;

public class Father extends GrandFather{

    public void fatherWork(){
        System.out.println("fatherWork");
    }

    @Override
    public void sleep(){
        //super.sleep();
        System.out.println("FatherSleep");
    }

    @Override
    public void eat() {

    }


}
