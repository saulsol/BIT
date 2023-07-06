package 배열;
// 아래와 같이 intArray 배열이 주어졌을 때
// 1)평균을 구하고
// 2)평균과 가장 차이가 큰 값
// 3)평균과 가장 차이가 작은 값 을 출력한ㄴ 프로그램을 만들어 봐라
public class P_74 {
    public static void main(String[] args) {

        int [] intArr = {3, 27, 13, 8, 235, 7, 22, 9, 435, 31, 54};
        int sum = 0;

        for (int i : intArr) {
            sum += i;
        }

        double avg = 1.0*sum / intArr.length; // 평균







    }

}
