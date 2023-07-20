package 객체지향.utilAPI2;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class ArraylistEx2 {
    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>(); // 크기 지정
        //modCount 가 내부적으로 있음

        list.add("딸기");
        list.add("수박");
        list.add("사과");
        list.add("멜론");
        list.add("오렌지");

        System.out.println(list);
//        Iterator<String> iterator = list.iterator();
//        // 반복 가능한 Iterator 객체 리턴, 내부 클래스 리턴
//        // ArrayList 내부 인스턴스 클래스
//        // 내부 인스턴스 클래스는 기본이 private다
//        System.out.println(iterator); // ArrayList$.... 형식으로 나온다
//
//        System.out.println(iterator.next()); // 딸기 -> 커서가 0부터 시작하기 때문에 넘어가면서 넘어온 노드를 출력
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next()); // 현재 커서의 위치가 증가되었음 따라서 false
//        System.out.println(iterator.hasNext());


        while (list.iterator().hasNext()){ // iterator 객체 새로 계속 만들어서 주소가 계속 반복
            System.out.println(list.iterator().next());
        }





        // ConcurrentModificationException
        //


    }

}
