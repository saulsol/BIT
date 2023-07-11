package 만들기;

import 메모리_예시.Mouse;

import java.util.Arrays;

public class MyStack {

    int top; // ptr
    int [] stack;

    public MyStack(int initCount){
        if(initCount<1) {
            System.out.println("Data range check");
            return;
        }
        stack = new int[initCount];
        top = -1;
    }

    public boolean isEmpty(){
        return stack[top] == 0;
    }

    public boolean isFull(){
        return top == stack.length-1 ? true : false;
    }

    public int peek(){
        return stack[top];
    }

    public void push (int value){
        top ++;
        stack[top] = value;

        if(top == stack.length-1){
            increment();
        }

    }

    public int pop(){
        return stack[top--];
    }

    public void increment(){
        int [] newStack = new int[top * 2];
        System.arraycopy(stack, 0, newStack, 0, stack.length);
        stack = newStack;
    }

    public void print(){
        System.out.println(Arrays.toString(stack));
    }
    public static void main(String[] args) {

        MyStack myStack = new MyStack(5);
        myStack.push(10);
        myStack.push(10);
        myStack.push(10);
        myStack.push(10);
        myStack.push(10);
        myStack.push(15);
        myStack.push(10);
        myStack.push(10);
        myStack.push(15);

        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.push(16);

        myStack.print();

    }
}
