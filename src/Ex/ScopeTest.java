package Ex;

class Parent{
    String s = "parent";

    public Parent(String s) {
        this.s = s;
    }
}

class Child extends Parent{
    String x = "child";



    public Child(String s) {
        super(s);
        super.s = "";
    }

    void method(){
        String x = "method";
        System.out.println("x : " + x);
        System.out.println("this.x : " + this.x);
        System.out.println("super.x : " + super.s);
    }

}

public class ScopeTest {
    public static void main(String[] args) {
        Child child = new Child("qkqh");
        child.method();
    }
}
