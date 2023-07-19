package 객체지향.collectionExample;

//
public class Board {

    private int no;

    private String id;

    private String writer;

    private String contents;

    public Board() {

    }

    public Board(int no, String id, String writer, String contents) {
        this.no = no;
        this.id = id;
        this.writer = writer;
        this.contents = contents;
    }

    public int getNo() {
        return no;
    }

    public String getId() {
        return id;
    }

    public String getWriter() {
        return writer;
    }

    public String getContents() {
        return contents;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }


    @Override
    public String toString() {
        return "Board{" +
                "no=" + no +
                ", id='" + id + '\'' +
                ", writer='" + writer + '\'' +
                ", contents='" + contents + '\'' +
                '}';
    }
}
