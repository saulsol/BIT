package 배열;

import java.util.Random;

public class P_61 {
    public static void main(String[] args) {

        int N = 6;
        Random random = new Random();
        int [] resultArray = new int[5];

        for(int i=0; i<resultArray.length; i++){
            resultArray[i] = random.nextInt(N) + 1;
        }

        for(int i=0; i<resultArray.length; i++){
            System.out.printf("%d번째 - %d%n", i, resultArray[i]);
        }


    }
}
