package 배열;

import java.util.Arrays;

public class P_75 {
    public static void main(String[] args) {

        int [] intArray = {3, 7, 2, 5, 7, 7, 9, 2, 8, 1, 1, 5, 3};
        int [] used = new int[10];

//        for(int i=0; i<intArray.length; i++){
//            for (int j=0; j<intArray.length; j++){
//                if(i == intArray[j]) used[i] ++;
//            }
//
//        }

        for(int num:intArray){
            used[num] ++;
        }


        System.out.println(Arrays.toString(used));



    }
}
