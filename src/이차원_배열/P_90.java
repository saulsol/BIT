package 이차원_배열;

public class P_90 {
    public static void main(String[] args) {

        int [][] grid = {

                {2, 3, 1, 4},
                {1, 58, 3, 2},
                {3, 4, 58, 58},
                {58, 4, 1, 5}
        };

        int [][] details = {{-1,0}, {1,0}, {0,-1}, {0,1}};
        int sum = 0;

        for(int r = 0; r<4; r++){
            for(int c=0; c<4; c++ ){
                if(grid[r][c] == 58 ){

                    for(int d = 0; d < 4; d++){

                        int nr = r + details[d][0];
                        int nc = c + details[d][1];

                        if(nr>=0 && nr<4 && nc>=0 && nc<4 && grid[nr][nc] != 58){
                            sum += grid[nr][nc];
                        }


                    }



                }
            }
        }

        System.out.println(sum);


    }
}
