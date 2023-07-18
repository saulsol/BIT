package 객체지향.example9;

public abstract class AbstractListEx implements ListEx {
    @Override
    public void add() {
        System.out.println("add");
    }

    public void clear(){
        System.out.println("clear");
    }

}
