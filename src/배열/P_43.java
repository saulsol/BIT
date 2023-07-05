package 배열;

// 100 번 주사위를 던진 결과의 합과 평균값(실수)을 출력하는 코드를 for 문을 이용하여 구현


import java.util.Random;

public class P_43 {
    public static void main(String[] args) {

        int sum = 0;
        int cnt = 100;
        double avg = 0;

        Random random = new Random();

        for(int i=0; i<cnt; i++){
            sum += random.nextInt(6) + 1;
        }

        avg = 1.0*sum/cnt; // 더블값 전환

        System.out.printf("sum: %d, avg: %f%n", sum, avg);





    }


}
