package 객체지향.utilAPI2;

import java.util.ArrayList;

public class ArrayListEx3 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        list.add(0, 97); // 기존에 있던 값들이 뒤로 밀려난다.
        System.out.println(list);

        list.set(1, 98);
        System.out.println(list); // 기존에 있던 값이 바뀐다.


        ArrayList<Integer> list2 = (ArrayList<Integer>) list.clone();
        System.out.println(list2);

        list2.addAll(list);
        System.out.println(list2); // list 붙이기



    }

}
