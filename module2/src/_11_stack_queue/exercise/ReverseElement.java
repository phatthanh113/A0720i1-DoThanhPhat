package _11_stack_queue.exercise;

import java.util.List;
import java.util.Stack;

public class ReverseElement {
    public static void reverseElement(Stack<?> stack) {
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }

    public static void main(String[] args) {
        Integer[] numberArray = {1,3,4,5,6,7,8};
        Stack<Integer> numbers = new Stack<>();
        loopArray(numberArray, numbers);
        reverseElement(numbers);
        System.out.println("===================");

        Stack<String> wStack = new Stack<>();

        String string = "thanh phat";
        String[] mWord = string.split(" ");
        loopArray(mWord,wStack);
        reverseElement(wStack);
    }

    private static <T> void loopArray(T[] elementArray, Stack<T> elements) {
        for (T element : elementArray) {
            elements.push(element);
        }
    }
}
