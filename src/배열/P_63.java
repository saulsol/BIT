package 배열;

public class P_63 {

    public static void main(String[] args) {

        String org = "123456789";

        char [] nums = org.toCharArray();
        int sum = 0;

        for(int i=0; i<nums.length; i++){
            sum += nums[i] - '0';
        }

        System.out.printf("sum: %d%n", sum);


    }


}
