package 객체지향.example;

public class Person {
    // 캡슐화
    private String name = "아니";
    {
        name ="BABO"; // 인스턴스 초기화 블록

    }


    {
        name ="test"; // 인스턴스 초기화 블록
    }

    // 생성자가 없는 경우에 -> 생성자 블록, 변수 초기화는 뒤에 나오는 것이 초기화를 담당


    /*
    * 생성자 특징
    *  * 자동 호출
    *  * 결과형이 없다
    *  * 클래스 이름과 같다
    *  * 오버로드가 가능하다
    *  * 단 한번 호출할 수 있다
    * */

    // 스태틱 변수에서는 인스턴스 변수를 사용할 수 없다 -> 객체를 생성하지 않고
    //
    public void setName(Person this, String name){
        this.name = name;
    }
    // this.name 을 안 하면 인스턴스 변수가 지정이 안된다



    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1.name);
    }

}
