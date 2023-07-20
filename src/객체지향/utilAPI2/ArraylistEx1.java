package 객체지향.utilAPI2;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistEx1 {

    public static void print(ArrayList x, ArrayList y){
        for(int i=0; i<x.size(); i++){
            System.out.printf("%5d", x.get(i));
        }

        System.out.println();

        for(Object o : y){
            System.out.printf("%5d", o);
        }
    }
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        // Array 기반의 list 컬렉션 : 동기화는 지원하지 않는다
        list.add(10);
        list.add(90);
        list.add(30);
        list.add(50);
        list.add(40);
        list.add(80);
        list.add(90);
        list.add(10);
        System.out.println(list);


        ArrayList list2 = new ArrayList(list.subList(1, 4));
        System.out.println(list2);

        Collections.sort(list); // 올림 소팅
        System.out.println("standard :" + list);


        Collections.sort(list, Collections.reverseOrder());
        System.out.println("reverse : "+list);

        print(list, list2);

        


    }

}
