package 객체지향;
// 상속(inheritance)
// is ~ a : ~ 은 ~이다 // has ~ a
public class ObjectEx extends Object{

    public void demoEx(){
        System.out.println(this.equals(new ObjectEx()));
        // this를 호출한 ObjectEx와 메소드 내부에서 생성한 ObjectEx 객체는 다르다

        new ObjectEx(); // Object 객체 생성, ObjectEx 객체 생성

    }

    public void demoEx2(){
        Object o = new Object();
        ObjectEx objectEx = (ObjectEx) new Object(); // classCastException
        objectEx.toString();

        Object obj = new ObjectEx();
//        ((ObjectEx)obj).demoEx2();
    }


    public static void main(String[] args) {
        ObjectEx objectEx = new ObjectEx();
        objectEx.demoEx();
        objectEx.demoEx2();
    }


}
