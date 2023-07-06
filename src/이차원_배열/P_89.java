package 이차원_배열;

public class P_89 {
    public static void main(String[] args) {

        // X -> 58 변환해서 풀었음

        int [][] grid = {

                {2, 3, 1, 4},
                {1, 58, 3, 2},
                {3, 4, 58, 58},
                {58, 4, 1, 5}
        };

        int sum = 0;
        for (int r = 0; r < 4; r++)
            for (int c = 0; c < 4; c++)
                if (grid[r][c] == 58) {
// 왼쪽 살펴보기
                    if (c - 1 >= 0 && grid[r][c - 1] != 58)
                        sum += grid[r][c - 1];
// 오른쪽 살펴보기
                    if (c + 1 < 4 && grid[r][c + 1] != 58)
                        sum += grid[r][c + 1];
                }


        System.out.println(sum);



    }

}
