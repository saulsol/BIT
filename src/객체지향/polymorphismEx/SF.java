package 객체지향.polymorphismEx;

public class SF extends Book {

    public String name;
    public String publisher;

    public SF(String name, String publisher) {
        super(name, publisher);
    }

    @Override
    void print() {
        System.out.println("print : SF");
    }
}
