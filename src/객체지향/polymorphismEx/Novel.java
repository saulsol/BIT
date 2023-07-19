package 객체지향.polymorphismEx;

public class Novel extends Book {

    public String name;
    public String publisher;

    public Novel(String name, String publisher) {
        super(name, publisher);
    }


    @Override
    void print() {
        System.out.println("print : novel");
    }
}
