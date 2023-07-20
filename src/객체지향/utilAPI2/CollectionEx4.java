package 객체지향.utilAPI2;

import java.util.Arrays;
import java.util.Comparator;

class Descending implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        if(o1 instanceof Comparable && o2 instanceof Comparable){
            Comparable c1 = (Comparable) o1; // String 에 있는 비교 메서드로 정렬
            Comparable c2 = (Comparable) o2;

            return c1.compareTo(c2)* -1;
        }
        return -1;
    }
}


public class CollectionEx4 {
    public static void main(String[] args) {

        String [] strArr = {"a", "B", "c", "z"};
        Arrays.sort(strArr);// 대문자 우선
        System.out.println(Arrays.toString(strArr));
//
//        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // 대소문자 무시하고 정렬
//        System.out.println(Arrays.toString(strArr));

        Arrays.sort(strArr, new Descending());
        System.out.println(Arrays.toString(strArr));

    }

}
