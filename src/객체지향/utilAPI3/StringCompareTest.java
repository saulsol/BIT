package 객체지향.utilAPI3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringCompareTest {
    public static void main(String[] args) {
        String[] word = {"boy", "Cat", "Lion", "dog", "elephant", "i", "dragon", "Any", "giraffe", "animal", "Dogcat", "girl"};
        List<String> list = Arrays.asList(word);
        System.out.println("1. " + list);
        Collections.sort(list);
        System.out.println("2. " + list);//String의 comparTo()는 사전순 정렬

//		문제
//		문자열 길이로 오름차순 정렬 후 사전 순 정렬
        Collections.sort(list, new Comparator<String>() {

            @Override
            public int compare(String s1, String s2) {
                int len1 = s1.length();
                int len2 = s2.length();
                if(len1 != len2) {
                    if(len1 < len2)
                        return -1;
                    else
                        return 1;
                }
                return s1.compareTo(s2);//return s1.compareTo(s2) * -1;//사전 역순 정렬
            }
        });
        System.out.println("3. " + list);//Comparator의 compare()를 override하여 길이순 정렬 후 사전순 정렬
    }


}