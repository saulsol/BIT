package 객체지향.example;

public class Overload {

    private int result;

    // 오버로드는 메소드의 매개변수 타입을 보고 오버로드가 될지 안될지 판단
    public int add(int x){
       return result += x;
    }
    public int add(int x, int y){
        return result = x + y;
    }

    public int add(int x, Long y){
        return result = (int) (x + y);
    }


    public void method(int ... x){ // 가변 인자
        for (int i : x) {
            System.out.println(i);
        }
    }
    public void method(int x){ // 가변 인자
        System.out.println(x);
    }

    public void method(int x, int ...y){ // 가변 인자
        System.out.println(x);
        System.out.println(y[0]);
    }

    public static void main(String[] args) {

        Overload o = new Overload();
        System.out.println(o.add(5,5));

        // 오버로드는 타입이 모호하면 에러가 뜬다.
       // o.method(1,2,3);
        o.method(1);



    }

}
