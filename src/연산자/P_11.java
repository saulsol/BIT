package 연산자;

public class P_11 {

    public static void main(String[] args) {

        int i1 = Integer.MAX_VALUE;
        int i2 = i1 + 1;

        System.out.println(i2);
        // 오버플로우가 나온다.
    }

}
