package 객체지향.utilAPI2;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistEx2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(); // 크기 지정
        list.add("딸기");
        list.add("수박");
        list.add("사과");
        list.add("멜론");
        list.add("오렌지");

        System.out.println(list);
        Iterator<String> iterator = list.iterator();
        // 반복 가능한 Iterator 객체 리턴, 내부 클래스 리턴
        // ArrayList 내부 인스턴스 클래스
        // 내부 인스턴스 클래스는 기본이 private다
        System.out.println(iterator); // ArrayList$.... 형식으로 나온다

        System.out.println(iterator.next()); // 딸기 -> 커서가 0부터 시작하기 때문에 넘어가면서 넘어온 노드를 출력


    }

}
