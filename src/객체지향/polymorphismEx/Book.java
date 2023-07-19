package 객체지향.polymorphismEx;

public class Book {

    public String name;
    public String publisher;


    Book(){
        this.name = "";
        this.publisher = "";
    }

    public Book(String name, String publisher) {
        this.name = name;
        this.publisher = publisher;
    }

    void print(){
        System.out.println("print : Book");
    }



}
