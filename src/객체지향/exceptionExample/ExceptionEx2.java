package 객체지향.exceptionExample;

public class ExceptionEx2 implements Cloneable {

    // 자바에서 프로토타입 패턴은 Cloneable 인터페이스를 붙여서 요청 들어올 때마다 객체를 복사해서 만든다.
    // 싱글톤 객체는 빈 컨테이너에서 싱글톤 객체 하나만 만들어서 처리하겠끔 해준다.
    // 따라서 요청 들어올 때마다 하나의 객체가 지속해서 처리를 한다.


    private int value;

    public ExceptionEx2(int value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return "ExceptionEx2{" +
                "value=" + value +
                '}';
    }

    public void cloneNotSupportedException() {
        Member m1 = new Member("Blue", 22);
        ExceptionEx2 exceptionEx2 = new ExceptionEx2(50);
        System.out.println(exceptionEx2.hashCode());

        try {
            ExceptionEx2 cloneExceptionEx = (ExceptionEx2) exceptionEx2.clone();
            System.out.println(exceptionEx2);
            System.out.println(cloneExceptionEx); // 내부적인 값은 같다
            System.out.println(cloneExceptionEx == exceptionEx2);
        } catch (CloneNotSupportedException exception) {


        }catch (ArithmeticException exception){


        }catch (Exception exception){

        }
    }


    public void interruptedException(){
        for(int i=0; i<1000; i++){
            if(i%7 == 0) System.out.println();

            System.out.printf("%5d", i);

            try {
                Thread.sleep(1000);
                if(i==5){
                    throw new InterruptedException();
                }
            } catch (Exception e) {
                if(e instanceof InterruptedException){

                }
            }
        }
    }










    public static void main(String[] args) {

        ExceptionEx2 exceptionEx2 = new ExceptionEx2(50);
        exceptionEx2.interruptedException();


    }
}
