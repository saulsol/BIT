package 객체지향.utilAPI;

import java.util.Iterator;

public abstract  class AbstractListEx implements ListEx {
    @Override
    public boolean add() {
        return false;
    }

    @Override
    public boolean addAll() {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains() {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    // abstract 클래스에서는 하위 클래스의 공통점을 구현한다.

}
