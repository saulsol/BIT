package 연산자;

public class P_20 {
    public static void main(String[] args) {

        byte b1 = 10;
        //b1 = b1 + 1;
        // 위 내용은 바이트 타입에서 인티저 타입으로 전환된 후 b1 에 저장하려니 에러


        b1 += 1;
        System.out.println(b1);
        //복합 연산자는 b1 = (byte)(b1 + 1) 로 변환되어서 계산됨

        byte b2 = ++b1;
        System.out.println(b2);

        byte b3 = (byte) (b2 + 1);
        System.out.println(b3);


    }
}
