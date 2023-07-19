package 객체지향.collectionExample;



import java.util.ArrayList;
import java.util.Scanner;

public class CollectionApp {

    Scanner scanner = new Scanner(System.in);
    static int no;

    public void boardInject(){

        Board board = new Board();
        board.setNo(++no);


        while (true){
            System.out.println("id");
            String id = scanner.next();
            if(validateId(board,id).getId().equals(id)){
                break;
            }
        } // id 중복검사 필요

        System.out.println("writer");
        board.setWriter(scanner.next());

        System.out.println("contents");
        board.setContents(scanner.next());

        BoardDao.getDao().boardAdd(board); // 매번 BoardDao 객체가 생성되는 문제 -> 싱글톤으로 해결
    }

    public void boardList(){
        System.out.println(BoardDao.getDao().getArrayList());

        //BoardDao.getDao().getArrayList().iterator();
        // iter 문을 사용할 수 있는 이유

    }


    private Board validateId(Board board, String id){
        ArrayList<Board> boardList = BoardDao.getDao().getArrayList();

        for(int i=0; i<boardList.size(); i++){

            if(boardList.get(i).getId().equals(id)){
                System.out.println("중복되는 id가 있습니다, 새로운 id를 지정해주세요~");
                board.setId(null);
                break;
            }else {
                board.setId(id);
            }

        }
        return board;
    }


    public void boardWriterSearch(String writer){
        ArrayList<Board> boardList = BoardDao.getDao().getArrayList();
        for(int i=0; i<boardList.size(); i++){
            if(boardList.get(i).getWriter().equals(writer)){
                System.out.println("작성자의 글이 있습니다 : " + i + "번째 글");
            }
        }
    }

    public void indexSearch(int idx){
        ArrayList<Board> boardList = BoardDao.getDao().getArrayList();
        for(int i=0; i<boardList.size(); i++){
            if(boardList.get(i).getNo() == idx){
                System.out.println(boardList.get(idx));
            }
        }
    }




    public void boardDelete(int index){ // 삭제를 원하는 index
        ArrayList<Board> boardList = BoardDao.getDao().getArrayList();
        boardList.remove(index);
    }


    public void print(){

        while (true) {
            System.out.println("1.Add 2.List 3.titleSearch 4.indexSearch 5.Delete");
            switch (scanner.nextInt()){
                case 1:
                    boardInject();
                    break;
                case 2:
                    boardList();
                    break;
                case 3:
                    boardWriterSearch(scanner.next());
                    break;
                case 4:
                    indexSearch(scanner.nextInt());
                    break;
                case 5:
                    boardDelete(scanner.nextInt());
                    break;
            }
        }


    }


    public static void main(String[] args) {
        CollectionApp collectionApp = new CollectionApp();
        collectionApp.print();







    }
}
