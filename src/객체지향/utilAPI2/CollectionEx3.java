package 객체지향.utilAPI2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CollectionEx3 {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        // 키값은 중복 불가, 밸류값은 중복 가능
        map.put(1,"java");
        map.put(1, "oracle");
        map.put(2, "spring");
        map.put(3, "react");

        System.out.println(map); // 충돌 안나게끔 지원 값을 덮어쓴디.

        System.out.println(map.get(2)); // spring
        System.out.println(map.containsKey(2)); // 2번 키가 있니
        System.out.println(map.containsValue("java")); // java 라는 값이 있니 => 대체되었음 아까


        String str1 = new String("str");
        String str2 = new String("str");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2)); // 내부적으로 오버라이딩이 되어있음
        System.out.println(str1.hashCode() == str2.hashCode());
        // 시스템 내부적으로 같은 문자열이면 굳이 해시 코드 여러개 안 만든다

        Iterator<Integer> iterator = map.keySet().iterator(); // key 값 집합이니깐
        while (iterator.hasNext()){
            Integer key = iterator.next();
            System.out.println("key : "+key+ ", value : " + map.get(key) );
        }

        // key와 vlaue를 엔트리로 묶어버릴 수 있다.
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        System.out.println(entries);

    }
}
