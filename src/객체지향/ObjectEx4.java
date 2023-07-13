package 객체지향;

public class ObjectEx4 { // 속성 (data)

    static int staticValue; // static 변수
    int instanceValue; // 인스턴스 변수

    ObjectEx4(){ // 생성자는 인스턴스 변수를 초기화할 때 사용
        staticValue = 100; // 스태틱 변수가 이미 메모리에 만들어져 접근할 수 있다.
//        static int value;
    }

    public void setInstanceValue(int instanceValue){
        this.instanceValue = instanceValue;
    }

    public static int getStaticValue(){
        return staticValue;
    }

    public static void setStaticValue(int staticValue){
        ObjectEx4.staticValue = staticValue;
    }

    public static void main(String[] args) {

        staticValue = 9; // 같은 스태틱이라서 가능

        ObjectEx4 objectEx4_1 = new ObjectEx4();
        ObjectEx4 objectEx4_2 = new ObjectEx4();

        objectEx4_1.setStaticValue(99);
        objectEx4_2.setStaticValue(1001);

        System.out.println(staticValue);

    }

}
