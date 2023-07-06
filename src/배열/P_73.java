package 배열;

public class P_73 {
    public static void main(String[] args) {

        int [] intArr = {3, 27, 13, 8, 235, 7, 22, 9, 435, 31, 54};

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int num : intArr){
            if(num < min){
                min = num;
            }

            if(num > max){
                max = num;
            }
        }


        System.out.printf("min : %d, max : %d", min, max);

    }

}
