package 객체지향.collectionExample;


import java.util.ArrayList;
import java.util.Scanner;

public class CollectionApp {

    Scanner scanner = new Scanner(System.in);
    ArrayList<String> arrayList = new ArrayList<>();

    public void print(){
        System.out.println("1.Add 2.List ");
    }


    public static void main(String[] args) {
        CollectionApp collectionApp = new CollectionApp();
        collectionApp.print();







    }
}
