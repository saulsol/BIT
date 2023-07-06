package 배열;

public class P_67 {
    public static void main(String[] args) {

        int [] intArray = {1, 3, 5, 7, 9};
        for (int x : intArray) {
            System.out.print(x + " ");
        }

        // index를 사용하지 않아도 된다.

        String [] students = {"홍길동", "임꺽정", "장길산", "이몽룡"};
        for (String student : students) {
            System.out.println(student);
        }


    }


}
