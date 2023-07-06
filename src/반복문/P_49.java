package 반복문;

public class P_49 {
    public static void main(String[] args) {

        for(int i=1; i<10; i++){
            for(int j=1; j<10; j++){

                if(j==5) break;  // 메소드 탈출
                if(j==3) continue; // 해당하는 부분 건너 뛰고 진행

                System.out.print(i*j+ "\t");

            }
            System.out.println();
        }

    }
}
