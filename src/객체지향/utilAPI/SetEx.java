package 객체지향.utilAPI;

import java.util.Iterator;

// 순서가 없는 자료구조, 중복이 불가능한 자료구조 -> Set
public interface SetEx extends CollectionEx {

    boolean remove();
    Iterator iterator(Object o);

}
