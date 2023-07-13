package 객체지향;

public class BookDriver {
    public static void main(String[] args) {

        Book book = new Book("책");

        Book book1 = book.bookMethod("책1");
        System.out.println(book1);


    }
}
