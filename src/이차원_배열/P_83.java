package 이차원_배열;

public class P_83 {
    public static void main(String[] args) {

        char[][] grid = {{'C', 'A', 'A'},
                         {'C', 'C', 'B'},
                         {'B', 'A', 'B'},
                         {'C', 'C', 'C'}
                        };

        for(char [] chars: grid){
            for(char c: chars){
                System.out.print(c + " ");
            }
            System.out.println();
        }

    }
}
