package 이차원_배열;

import java.util.Arrays;

public class ArrayPractice {

    public void arrayProcessCore(int [] y) {
        y = new int [y.length];
        System.out.println(y[0]);
    }

    public char[] reverseChar(char [] c){

        char [] solution = new char[c.length];

        for(int i=0; i<solution.length; i++){
            solution[i] = c[solution.length-i-1];
        }

        return solution;
    }

    public static void main(String[] args) {

        int [] x = {5, 6, 70};

        ArrayPractice arrayPractice = new ArrayPractice();
        arrayPractice.arrayProcessCore(x);
        System.out.println(x[0]);

        char [] chars = {'A', 'B', 'C', 'D', 'E'};
        chars = arrayPractice.reverseChar(chars);
        System.out.println(Arrays.toString(chars));

    }
}
