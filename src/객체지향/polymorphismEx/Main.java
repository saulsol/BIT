package 객체지향.polymorphismEx;

public class Main {
    public static void main(String[] args) {
        
        Book b = new Novel("메타버스 소설", "출판사(IT)");
        Book c = new SF("메타버스","SF 출판사");

        b.print();
        c.print();

        if(b instanceof Novel){
            b.print();
        }

        if(c instanceof SF){
            c.print();
        }
    }

}
