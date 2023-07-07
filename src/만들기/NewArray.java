package 만들기;
// CRUD 를 배열로 구현

// isFull
// isEmpty
// add (isEmpty -> true)
// list 전체 출력
// search 순회 탐색
// modify
// delete -> 삭제되는 인덱스 + 1 포함 뒷 부분 전부 앞으로 갖고오기

import java.util.Arrays;

// increment(isFull이 TRUE 인 경우에 배열의 크기를 재할당 배열 크기
// 두 배  Arrays.copy()써서 배열값 복사)
public class NewArray {

    private static final int MAX_SIZE = 10;
    static int size = MAX_SIZE; // 실제 사이즈
    private static int [] myArray = new int[size];
    int ptr; // 현재 값이 들어가야 할 부분


    public void add (int input){

        if(isFull()){
            myArray[ptr] = input;
            ptr ++;
        }else{
            System.out.println("스택이 전부 찼습니다. 스택 사이즈를 재할당 하겠습니다. 원하는 값을 한 번더 입력해주세요");
            myArray = reallocation();
            myArray[ptr] = input; // 값을 추가
            ptr++;
        }

    }
    private boolean isFull(){

        if(size <= ptr) {
            return false;
        }
        else{
            return true;
        }

    }


    private int [] reallocation(){
        int [] increasedArray = new int[size*2];
        size = size * 2;
        System.arraycopy(myArray, 0, increasedArray, 0, myArray.length);
        return increasedArray;
    }


    private void printList(){
        System.out.println(Arrays.toString(myArray));
    }

    // 탐색
    public boolean search(int input){
        for(int i=0; i<ptr; i++){
            if(input == myArray[i]){
                System.out.println("스택 내부에 검색하신 값이 존재합니다.");
                return true;
            }
        }
        System.out.println("검색하신 값이 없습니다.");
        return false;
    }

    // 인덱스를 받아 값을 변경하는 경우
    public void modify(int idx, int modifiedInput){
            myArray[idx] = modifiedInput;
    }

    public void delete(int idx){
        for(int i=idx; i<ptr; i++){
            myArray[i] = myArray[i+1];
        }
        ptr--;
    }



    public static void main(String[] args) {

        NewArray newArray = new NewArray();

        newArray.add(1);
        newArray.add(2);
        newArray.add(3);
        newArray.add(4);
        newArray.add(5);
        newArray.add(6);
        newArray.add(7);
        newArray.add(8);
        newArray.add(9);
        newArray.add(10);
        newArray.add(11);

        newArray.modify(5, 90);

        System.out.println(newArray.search(90));

       // newArray.delete(5);
        newArray.add(15);

        newArray.printList();




    }


}
