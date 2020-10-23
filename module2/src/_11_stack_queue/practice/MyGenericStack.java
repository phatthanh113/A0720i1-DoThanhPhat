package _11_stack_queue.practice;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.List;

public class MyGenericStack<T> {
    private LinkedList<T> stack;
    public MyGenericStack() {
      stack = new LinkedList<>();
    }
    public void push(T element) {
        stack.addFirst(element);
    }
    public T pop() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
    public int size() {
        return stack.size();
    }
    public boolean isEmpty() {
        if(stack.size()==0) {
            return true;
        }
        return false;
    }
    public static void printElement(MyGenericStack<?> stack) {
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
    public static void main(String[] args) {
        MyGenericStack<String> stringArray = new MyGenericStack<>();
        stringArray.push("one");
        stringArray.push("two");
        stringArray.push("three");
        MyGenericStack<Integer> integerMyGenericStack = new MyGenericStack<>();
        integerMyGenericStack.push(1);
        integerMyGenericStack.push(2);
        integerMyGenericStack.push(3);
        printElement(stringArray);
        printElement(integerMyGenericStack);
    }
}
