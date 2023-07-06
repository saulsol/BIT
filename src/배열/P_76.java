package 배열;

import java.util.Arrays;

public class P_76 {
    public static void main(String[] args) {

        int [] intArray = {1, 3, 4, 7, 8, 10, 12, 15, 16, 17, 18};
        int [] used = new int[21];


        for (int i : intArray) {
            used[i] ++;
        }

        System.out.println(Arrays.toString(used));
    }

}
