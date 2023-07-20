package 객체지향.utilAPI2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class CollectionEx1 {
    public static void main(String[] args) {

        // transient -> 직렬화 대상 배제
        // hashSet -> HashMap 생성됨, 대신 값이 중복되는 경우는 없음

        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();
        String [] str = {"java", "html", "react", "java", "spring", "html", "node.js"};

        for(int i=0; i<str.length; i++){
            if(!set1.add(str[i])){ // 중복되는 값이 있으면 false 리턴
                set2.add(str[i]);
            }
        }

        System.out.println(set1);
        System.out.println(set2);

        System.out.println(set1.contains("java"));


        HashSet<Book> set3 = new HashSet<>();
        set3.add(new Book(9000, "abc"));
        set3.add(new Book(9000, "abc"));
        System.out.println(set3);
        System.out.println(set3.contains(new Book(9000, "abc")));

        System.out.println(set3.clone()); // 복사한 객체를 리턴

        Iterator<Book> ib = set3.iterator(); // iterator 객체 리턴
        while (ib.hasNext()){
            System.out.println(ib.next().getPrice());
        }







    }

}
