package 객체지향;

public class Book {

    private String title;
    private String author;
    private String publisher;
    private int price;
    private String nation;


    public Book(String title){
        this.title = title;
    }
    public Book(String title, String author, String publisher, int price, String nation) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.nation = nation;
    }


    public Book bookMethod(String title){
        Book book = new Book(title);
        return this; // 내부에 선언된 객체가 아닌 해당 메서드를 콜한 객체 본인 자신
    }

    // this 는 항상 객체 본인 자신을 가리킴

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", price=" + price +
                ", nation='" + nation + '\'' +
                '}';
    }
}
