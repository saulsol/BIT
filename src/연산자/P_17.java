package 연산자;

import java.math.BigDecimal;

public class P_17 {
    public static void main(String[] args) {

        // 실수의 연산은 정확하지 않다.
        // 유효 자리수를 이용한 반올림 처리

        float f1 = 2.0f;
        float f2 = 1.1f;
        float f3 = f1 - f2;
        System.out.println(f3); // 0.9


        double d1 = 2.0;
        double d2 = 1.1;
        double d3 = d1 - d2;
        System.out.println(d3); // 0.89999999999...

        System.out.println(((int)(d1*100) - (int)(d2*100)) / 100.0); // 0.9

        BigDecimal b1 = new BigDecimal("2.0");
        BigDecimal b2 = new BigDecimal("1.1");

        System.out.println("BigDecimal을 이용한 빼기 : " + b1.subtract(b2));


    }

}
