package 객체지향.collectionExample;



import java.util.Scanner;

public class CollectionApp {

    Scanner scanner = new Scanner(System.in);
    static int no;

    public void boardInject(){

        Board board = new Board();
        board.setNo(++no);

        System.out.println("id");
        board.setId(scanner.next()); // id 중복검사 필요

        System.out.println("writer");
        board.setWriter(scanner.next());

        System.out.println("contents");
        board.setContents(scanner.next());

        BoardDao.getDao().boardAdd(board); // 매번 BoardDao 객체가 생성되는 문제 -> 싱글톤으로 해결
    }

    public void boardList(){
        System.out.println(BoardDao.getDao().getArrayList());
    }




    public void print(){

        while (true) {
            System.out.println("1.Add 2.List ");
            switch (scanner.nextInt()){
                case 1:
                    boardInject();
                    break;
                case 2:
                    boardList();
                    break;

            }
        }


    }


    public static void main(String[] args) {
        CollectionApp collectionApp = new CollectionApp();
        collectionApp.print();







    }
}
