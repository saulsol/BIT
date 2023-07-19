package 객체지향.collectionExample;

import java.util.ArrayList;

public class BoardDao {

    static ArrayList<Board> arrayList = new ArrayList<>();

    private static BoardDao boardDao;

    public static BoardDao getDao(){
        if(boardDao == null){
            boardDao = new BoardDao();
        }
        return  boardDao;
    }

    public void boardAdd(Board board){
        System.out.println(board);
        arrayList.add(board);
    }


    public ArrayList<Board> getArrayList(){
        return arrayList;
    }

}
