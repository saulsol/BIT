package 객체지향.inner;
// static (Compile) | instance (Runtime)
public class StaticOuterClass {

    private static int staticValue; // 컴파일 타임에 메모리 할당
    private int instanceValue;
    public static void showStatic(){

    }

    public void method(){
        staticValue = 100;
        // private int show; // 지역에 선언한 변수는 접근 제어자를 붙이지 않습니다.
        // 왜냐 어차피 로컬에서 태어나서 로컬에서 죽을 건데 뭐하러 접근 제어자를 붙여
    }

    public static void staticMethod(){
         // instanceValue = 100; -> 인스턴스 변수에 접근 불가
    }



    public static class Inner{ // (instance 클래스인 경우)외부 클래스가 객체가 된 후 생성됨
        private static int innerStaticValue;
        // Inner 클래스는 외부가 객체가 된 후 메모리가 할당되는데 변수가 static이면 안된다
        private int innerValue;
        public Inner(){
            staticValue = 100;
            // instanceValue = 100;
            // staticInnerClass -> 외부 Instance 변수에 접근 불가
        }

    }

    public static void main(String[] args) {
        Inner inner = new StaticOuterClass.Inner();

    }

}
