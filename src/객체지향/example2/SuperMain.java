package 객체지향.example2;

public class SuperMain {


    public void actionLang(Object s){
        if(s instanceof String){ // 초중요 : ClassCastException 방지
            System.out.println(((String)s).charAt(0));
        }
        // 다운 캐스팅을 하는 경우에는 instanceof 연산자를 사용한다.
    }

    public static void main(String[] args) {
//        Child1 child1 = new Child1();
//        child1.superMethod();
//        child1.child1Method();
//
//        Child2 child2 = new Child2();


        Super s = new Child1();

        SuperMain superMain = new SuperMain();
        superMain.actionLang("안");

        System.out.println("------------------------------------");
        Child1 child1 = new Child1();

    }
}
