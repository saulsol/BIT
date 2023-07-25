package 제네릭;

import java.util.ArrayList;
import java.util.List;


class Fruit{
    public String toString(){
        return  "Fruit";
    };
}

class Apple extends Fruit{
    public String toString(){
        return  "Apple";
    };
}

class Grape extends Fruit{
    public String toString(){
        return  "Grape";
    };
}

class Toy{
    public String toString(){
        return  "Toy";
    };
}


class Box<T> {
    ArrayList<T> list = new ArrayList<>();

    public void add(T item){
        list.add(item);
    }

    T get(int index){
        return list.get(index);
    }





}









public class GenericEx1<T> {






    public static void main(String[] args) {

        List<String> list; // 제네릭은 컴파일 이전에 타입을 확정시킨다 => 타입 안정성

        Box<Fruit> fruitBox = new Box<>();
        Box<Apple> appleBox = new Box<>();
        Box<Toy> toyBox = new Box<>();

        // Box<Grape> grapeBox = new Box<Apple>(); -> 에러 








    }

}
