package 객체지향.example4;

public class Action {

    private int value;


    static Action action;

    public static Action getAction(){
        if(action==null){
            action=new Action();
        }
        return action;
    }


    public static Action getInstance(){
        return new Action();
    }


    private Action(){ // 생성자 private 선언할 수 있다. -> 객체 생성 불가

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
