package 연산자;

public class P_15 {

    public static void main(String[] args) {

        int i1 = Integer.MAX_VALUE;
        int i2 = i1 + 1;
        System.out.println(i2);

        long l1 = i1+1; // 이미 오버플로우가 터진 상테로 long 값으로 저장
        System.out.println(l1);

        long l2 = (long) (i1 + 1);
        System.out.println(l2);

        long l3 = (long) i1 + 1; // 타입 변환 후 에 더하기 때문에 오버플로우가 나오지 않는다.
        System.out.println(l3);

        int i3 = 1000000 * 1000000 / 100000; // 값이 오버플로우가 된 상태에서 몫 연산
        int i4 = 1000000 / 10000 * 10000;
        System.out.println(i3 + " : " + i4);



    }


}
