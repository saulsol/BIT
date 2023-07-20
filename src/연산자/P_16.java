package 연산자;

public class P_16 {
    public static void main(String[] args) {

        int k = 66;
        char c = (char) k;
        System.out.println("1: " + c);

        c = 'A';
        k = c;
        System.out.println("2: " + k);

        int i = 10 / 3;
        System.out.println("3: "+i);

        float f = 10 / 3;
        System.out.println("4: "+f); // 3.0 으로 저장

        float f2 = 10f / 3F; // 3.333333... 으로 저장
        System.out.println("5: "+f2);

        double d = 10d / 3D;
        System.out.println("6: "+d);

        System.out.println("7: "+(10 / 3) * 3);


    }
}
