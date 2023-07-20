package 만들기;


// 큐 -> 선입선출
//

import java.util.Arrays;

public class MyQueue  {

    int add(int a, int b){
       return a + b;
    }








    private int size;
    private int rear = -1;
    private int front = -1;

    private int [] queue;

    public MyQueue(int size){ // 생성자 : 인스턴스 변수 초기화
        this.size = size;
        queue = new int[size];
    }

    public boolean isEmpty(){
        return rear == front;
    }

    public boolean isFull(){
        return rear == queue.length-1;
    }

    public void disp(){
        System.out.println(Arrays.toString(queue));
    }

    public void enQueue(int value){
        if(isFull()){
            System.out.println("큐가 전부 찼습니다.");
           int [] newQueue = new int [size * 3];
           System.arraycopy(queue, 0, newQueue, 0, queue.length);
           queue = newQueue;
        }
        queue[++rear] = value;
    }

    public void deQueue(){
        if(isEmpty()){
            System.out.println("스택이 비어있습니다. (디큐 불가능)");
        }else {
            if(front == rear){
                front = -1;
                rear = -1;
            }
            queue[++front] = 0;
        }
    }

    public int size(){
        return rear - front;
    }

    public void addFirst(int value){
        queue[front] = value;
    }
    public void addLast(){

    }


    public static void main(String[] args) {

        MyQueue myQueue = new MyQueue(10);
        myQueue.enQueue(1);
        myQueue.deQueue();
        myQueue.enQueue(2);
        myQueue.enQueue(3);
        myQueue.enQueue(4);
        myQueue.enQueue(5);
        myQueue.enQueue(6);
        myQueue.enQueue(7);
        myQueue.enQueue(8);
        myQueue.enQueue(9);
        myQueue.enQueue(10);

        myQueue.enQueue(10);
        myQueue.enQueue(10);

        myQueue.deQueue();

        System.out.println(myQueue.size());

        myQueue.disp();



    }
}
