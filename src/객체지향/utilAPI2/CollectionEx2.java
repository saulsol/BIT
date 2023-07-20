package 객체지향.utilAPI2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionEx2 {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        int [][] frame = new int[5][5];

        for(int i=0; set.size()< 25; i++ ){
                set.add((int)(Math.random()*50 + 1));
        }

        Iterator<Integer> iterator = set.iterator();
        for(int i=0; i<frame.length; i++){
            for(int j=0; j<frame[i].length; j++){
                frame[i][j] = iterator.next();
                System.out.printf("%5d",frame[i][j]);
            }
            System.out.println();
        }


    }

}
