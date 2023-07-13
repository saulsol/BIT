package 객체지향.example2;

public class Super {

    private int superValue;

    public Super(){
        System.out.println("Super()");
    }

    public Super(int superValue){
        this.superValue = superValue;
    }

    public String toString(){
        return String.valueOf(superValue);
    }



    public void superMethod(){
        System.out.println("superMethod");
    }


}
