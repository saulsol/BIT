package 조건문;

// 주사위를 두 번 던져서 연속적으로 짝수 또는 홀수가 나오면 "A" 그렇지 않으면 "B" 를 출력하는 코드를 작성해라

import java.util.Random;

public class P_37 {
    public static void main(String[] args) {

        int N = 6;

        Random random = new Random();
        int num1 = random.nextInt(N) + 1; // 한 번의 주사위를 굴리겠다.
        int num2 = random.nextInt(N) + 1; // 한 번의 주사위를 굴리겠다.

        //random.nextInt(N)  0 부터 N까지 랜덤한 숫자를 생성한다.

        String result = null;

        boolean isNum1Even = num1%2 == 0;
        boolean isNum2Even = num2%2 == 0;

        if(isNum1Even){
            if(isNum2Even){
                System.out.println("A");
            }else {
                System.out.println("B");
            }
        }else{

            if(!isNum2Even){
                System.out.println("A");
            }else {
                System.out.println("B");
            }
        }



        // 삼항 연산자로 간단하게 만들어 보자
        result = isNum1Even == isNum2Even?"A":"B";
        System.out.println(result);

        // 수학적 개념에 의한 개선
        result = (num1 + num2) % 2==0 ? "A" : "B";
        System.out.println(result);


    }
}
